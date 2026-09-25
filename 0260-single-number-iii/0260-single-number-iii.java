class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int num:nums){
            xor^=num;
        }
        int diff=xor & -xor;
        int first=0;
        int second=0;
        for(int num:nums){
            if((num & diff)==0){
                first^=num;
            }
            else{
                second^=num;
            }
        }
        return new int[]{first,second};   
    }
}