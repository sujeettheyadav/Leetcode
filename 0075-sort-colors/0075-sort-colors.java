class Solution {
    public void sortColors(int[] nums) {
        int zero=0,one=0,two=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            else if(nums[i]==1){
                one++;
            }
            two++;
        }
        int j=0;
        while(zero>0){
            nums[j++]=0;
            zero--;
            
        }
        while(one>0){
            nums[j++]=1;
            one --;
            
        }
        while(two>0 &&  j<nums.length){
            nums[j++]=2;
            two--;
           
        }    
    }

}