class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack=new Stack<>();
        Integer index[]=new Integer[position.length];
        for (int i=0;i<position.length;i++){
            index[i]=i;
        }
         Arrays.sort(index, (a, b) -> position[b] - position[a]);
        //Arrays.sort(position);
        for(int i=0;i<position.length;i++){
            int j = index[i];
            double time=(double)(target-position[j])/speed[j];
            if(stack.isEmpty() || time>stack.peek()){
                stack.push(time);  
            } 
        }
        return stack.size(); 
    }
}
