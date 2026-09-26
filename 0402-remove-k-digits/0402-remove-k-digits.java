class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack=new Stack<>();
        int count=0;
        for(int i=0;i<num.length();i++){
            while(!stack.isEmpty()&&k>0&&stack.peek() > num.charAt(i) ){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        while(k>0){
                stack.pop();
                k--;
        }
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        int i=0;
        while(i<result.length()&&result.charAt(i)=='0'){
            i++;
        }
        result=new StringBuilder(result.substring(i)); 
        if(result.length()==0){
            return "0";
        }
        return result.toString();
    }
}