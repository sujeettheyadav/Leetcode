class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[nums.length];
        int i=0;
        int j=i+n;
        int k=0;
        while(i<nums.length/2 &&j<nums.length){
            ans[k]=nums[i];
            ans[k+1]=nums[j];
            k+=2;
            i++;
            j++;
        }
        return ans;
    }
}