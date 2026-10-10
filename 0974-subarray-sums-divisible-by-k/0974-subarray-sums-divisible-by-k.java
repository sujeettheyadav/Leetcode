class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ps[] =new int[k];
        int sum=0;
        int result=0;
        ps[0]=1;
        for(int num:nums){
            sum=(sum+num)%k;
            sum=(sum+k)%k;//to handke negative ps sum
            result+=ps[sum];
            ps[sum]++;
        }
        return result; 
    }
}