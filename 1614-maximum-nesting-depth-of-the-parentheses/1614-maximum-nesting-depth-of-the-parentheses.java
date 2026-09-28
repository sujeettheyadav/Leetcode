class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=0;
        for(char num:s.toCharArray()){
            if(num=='(') count++;
            else if(num==')') count--;
            max=Math.max(max,count);
            
        }
        return max;
        
    }
}