class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String c:operations){
            if(c.equals("C")){
                stack.pop();
            }
            else if(c.equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(c.equals("+")){
                stack.push(stack.peek()+stack.get(stack.size()-2));
            }
            else{
                stack.push(Integer.valueOf(c));
            }

        }
        int sum=0;
        for( int i:stack){
            sum+=i;
        }
        return sum;
    }
}