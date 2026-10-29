class Solution {
    public String sortVowels(String s) {
        char[] arr=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(isVowels(arr[i])) sb.append(arr[i]);
        }
        char[] v=sb.toString().toCharArray();
        Arrays.sort(v);
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(isVowels(arr[i])){
                arr[i]=v[j];
                j++;
            } 
        }
        return new String(arr);
    }
    private boolean isVowels(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }    
}