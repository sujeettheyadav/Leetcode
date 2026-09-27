class Solution { 
    public int[] asteroidCollision(int[] asteroids) { 
        
        Stack<Integer> stack = new Stack<>(); 
        for(int i = 0; i < asteroids.length; i++) { 
            while(!stack.isEmpty() && asteroids[i] < 0 && stack.peek() >= 0) { 
                if(stack.peek() < -asteroids[i]) {
                    stack.pop();
                }
                else if(stack.peek() == -asteroids[i]) {
                    stack.pop();
                    asteroids[i] = 0;
                    break;
                }
                else {
                    asteroids[i] = 0;
                    break;
                }
            }
            if(asteroids[i] != 0) {
                stack.push(asteroids[i]);
            }
        }
        int[] result = new int[stack.size()];
        
        for(int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }
        return result;
    } 
}