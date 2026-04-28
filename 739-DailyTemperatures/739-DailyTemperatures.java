// Last updated: 4/28/2026, 10:46:04 AM
import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++){
            
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                result[stack.peek()] = i - stack.peek();
                stack.pop();
            }

            stack.push(i);
                
        }

        while (!stack.isEmpty()){
            result[stack.peek()] = 0;
            stack.pop();
        }

        return result;
    }
}