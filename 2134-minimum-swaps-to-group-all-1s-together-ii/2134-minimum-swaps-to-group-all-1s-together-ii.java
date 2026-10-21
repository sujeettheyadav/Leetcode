class Solution {
    public int minSwaps(int[] nums) {
        int one=0;
        for(int num:nums){
            if(num==1) one++;
        }
        int sum=0;
        int i=0;
        int swap=Integer.MAX_VALUE;;
        int j=0;
        for(j=0;j<nums.length+one-1;j++){
            sum+=nums[j%nums.length];
            if(j-i+1>one) {
                sum-=nums[i%nums.length];
                i++;
            }
            if(j-i+1==one){
                swap=Math.min(swap,one-sum);
            }
        }
        if (swap == Integer.MAX_VALUE) {
            return 0;
        }
        else {
            return swap;
        }
    }
}