class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int k=0;
        int ans[]=new int[2];

        while(i<j){
            if(numbers[i]+numbers[j]==target){
                ans[k]=i+1;
                k++;
                ans[k]=j+1;
                return ans;
            }
            
            else if(numbers[i]+numbers[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
        
    }
}