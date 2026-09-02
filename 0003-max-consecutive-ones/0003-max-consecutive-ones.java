class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curcnt=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]==1){
                curcnt++;
                max=Math.max(max,curcnt);
                
            }
            else{
                curcnt=0;
            }

        }
        return max;
        
    }
}