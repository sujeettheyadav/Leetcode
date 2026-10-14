
class Solution {
    public void nextPermutation(int[] nums) {
        int pivotindex = -1;

        // Step 1: Find pivot
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                pivotindex = i - 1;
                break;
            }
        }

        // Step 2: Find next greater element and swap
        if (pivotindex != -1) {
            int swapindex = -1;

            for (int j = nums.length - 1; j > pivotindex; j--) {
                if (nums[j] > nums[pivotindex]) {
                    swapindex = j;
                    break;
                }
            }

            swap(nums, pivotindex, swapindex);
        }

        // Step 3: Reverse suffix
        reverse(nums, pivotindex + 1, nums.length - 1);
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
