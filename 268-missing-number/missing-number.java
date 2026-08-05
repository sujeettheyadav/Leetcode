class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        int sumn=0;
        for(int i=0;i<=n-1;i++ ){
            sumn+=nums[i];
        }
        return sum-sumn;
        
        
    }
    
}