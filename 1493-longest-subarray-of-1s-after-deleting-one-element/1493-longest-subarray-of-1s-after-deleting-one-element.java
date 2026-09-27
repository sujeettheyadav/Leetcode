class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        int sum=0;
        int i=0;
        int size=nums.length;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum+1<j-i+1){
                sum-=nums[i];
                i++;
            }
            max=Math.max(sum,max);
        }
        if(max==size){
            return max-1;
        } 
        return max;
        
    }
}