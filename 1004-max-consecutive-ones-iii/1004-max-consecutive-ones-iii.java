class Solution {
    public int longestOnes(int[] nums, int k) {
        int sum=0;
        int i=0;
        
        int max=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(j-i+1-sum<=k){
                max=Math.max(max,j-i+1);
            }
            if(j-i+1-sum>k){
                sum-=nums[i];
                i++;
            }
           
        }
        return max;
    }
}