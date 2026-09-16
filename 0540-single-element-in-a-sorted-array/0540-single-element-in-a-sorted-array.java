class Solution {
    public int singleNonDuplicate(int[] nums) {
        int check=0;
        for(int i=0;i<nums.length;i++){
            check^=nums[i];
        }
        return check;
        
    }
}