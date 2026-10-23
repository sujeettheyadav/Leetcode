class Solution {
    public int[] transformArray(int[] nums) {
        int ans[]=new int[nums.length];
        int right=nums.length-1;
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) ans[left++]=0;
            else ans[right--]=1;
        }
        return ans;
    }
}