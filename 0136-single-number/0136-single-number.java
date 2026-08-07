class Solution {
    public int singleNumber(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            //using xor same number will cancel each other and only unique will remain 
            n^=nums[i]; 

        }
        return n;
        
    }
}