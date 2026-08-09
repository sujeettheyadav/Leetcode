class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        
        String curr = "";
        int k = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                k = k * 10 + (ch - '0');   // handle multiple digits
            }
            else if(ch == '['){
                numStack.push(k);
                strStack.push(curr);
                k = 0;
                curr = "";
            }
            else if(ch == ']'){
                int count = numStack.pop();
                String prev = strStack.pop();

                String temp = "";
                for(int j = 0; j < count; j++){
                    temp += curr;
                }

                curr = prev + temp;
            }
            else{
                curr += ch;
            }
        }

        return curr;
    }
}