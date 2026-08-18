class Solution {
    public String reverseWords(String s) {
        char nums[]= s.toCharArray();
        int start=0;
        for(int i=0;i<=nums.length;i++){
            if(i==nums.length || nums[i]==' '){
                int left=start;
                int right=i-1;
                while(left<right){
                    char temp=nums[left];
                    nums[left]=nums[right];
                    nums[right]=temp;
                    left++;
                    right--;
                }
                start=i+1;
                
            }
            
        }
        return new String(nums);
        
    }
}