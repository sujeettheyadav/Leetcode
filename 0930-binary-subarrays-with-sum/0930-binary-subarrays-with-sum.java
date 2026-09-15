class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    private int atMost(int nums[],int goal){

    
        int left=0;
        int sum=0;
        int count=0;
        //if(sum==0 && goal==0) return 0;
        if(goal<0) return 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>goal){
                sum-=nums[left];
                left++;
            }
            /*if(sum==goal){
                count++;  
            }*/
            count+=i-left+1;

        }
        return count;
        
    }
}