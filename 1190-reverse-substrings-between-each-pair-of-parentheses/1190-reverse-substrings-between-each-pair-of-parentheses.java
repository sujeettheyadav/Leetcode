class Solution {
    public String reverseParentheses(String s) {
        Stack <String> stack=new Stack<>();
        String current="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(current);
                current = "";
            }
            else if(s.charAt(i)==')'){
                String rev="";
                for(int j=current.length()-1;j>=0;j--){
                    rev+=current.charAt(j);
                }
                current=stack.pop()+rev;
            }
            else{
                current+=s.charAt(i);
            }
        }
        return current;  
    }
}