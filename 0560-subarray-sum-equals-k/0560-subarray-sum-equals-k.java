class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum == k) {
                count++;
            }

            if (i == nums.length - 1) {
                start++;
                i = start - 1;
                sum = 0;
            }
        }

        return count;
    }
}