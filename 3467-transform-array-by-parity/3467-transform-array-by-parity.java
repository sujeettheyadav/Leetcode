class Solution {
    public int[] transformArray(int[] nums) {
        int ans[]=new int[nums.length];
        int zero=0;
        int one=0;
        for(int num:nums){
            if(num%2==0) zero++;
            else one++;
        }
        int i=0;
        while(zero>0){
            ans[i++]=0;
            zero--;
        }
        while(one>0){
            ans[i++]=1;
            one--;
        }
        return ans;  
    }
}