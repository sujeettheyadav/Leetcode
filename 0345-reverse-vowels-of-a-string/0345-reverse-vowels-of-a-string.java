class Solution {
    public String reverseVowels(String s) {
        int i=0;
        
       
        char arr[]=s.toCharArray();
        int j=arr.length-1;
        while (i<j){
            if(isVowel(arr[i]) && isVowel(arr[j]) ){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if(!isVowel(arr[i])){
                i++;
            }
            else{
                j--;
            }
        } 
        return new String(arr);
        
    }
     public boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || 
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || 
               ch == 'O' || ch == 'U';
    }
}