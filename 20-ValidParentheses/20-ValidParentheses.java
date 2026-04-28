// Last updated: 4/28/2026, 10:47:05 AM
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack <Character> stack = new Stack<>();
       


        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i); 
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            else {
                if (stack.empty()){
                    return false;
                }

                char top = stack.pop();

                if ((top == '{' && c != '}') ||
                    (top == '(' && c != ')') ||
                    (top == '[' && c != ']')) {
                    return false;
                }

                

            }

            
        }

        if (!stack.empty()){
            return false;
        }

    return true;
    }


        
}
