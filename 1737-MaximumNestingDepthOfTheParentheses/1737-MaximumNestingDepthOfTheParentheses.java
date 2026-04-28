// Last updated: 4/28/2026, 10:45:49 AM
import java.util.Stack;

class Solution {
    public int maxDepth(String s) {

        int nestedMax = 0;
        int current = 0;

        if (s.length() < 2) return 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length() ; i++){
            stack.push(s.charAt(i));



            while (!stack.empty()) {
                
                char c = stack.pop();

                if (c == '(') {
                    current++;
                    nestedMax = Math.max(nestedMax, current);

                }


                if (c == ')'){
                    current--;
                }
            }
                

        

        }

        return nestedMax;

    }
}