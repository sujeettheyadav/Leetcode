class Solution {
    public boolean detectCapitalUse(String word) {
        char arr[]=word.toCharArray();
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(arr[i])){
                count++;
            }
        }    
        if(n==count){
            return true;
        }
        if(count==0){
            return true;
        }
        if(count == 1 && Character.isUpperCase(arr[0])){
            return true;
        }
        
        return false;
           
    }     
            
}

