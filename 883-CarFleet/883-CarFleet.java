// Last updated: 4/28/2026, 10:45:59 AM
import java.util.Stack;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double fleetHead = -1;
        Stack <Double> stack = new Stack<>();
        double[][] cars = new double[position.length][2];
    

        for (int i = 0; i < cars.length; i++){
            cars[i][0] = position[i];
            cars[i][1] = (double)((target-cars[i][0]) / - speed[i]);
        }

        Arrays.sort(cars, (a,b) -> Double.compare(b[0] , a[0]));

 
        for ( int i = 0; i < cars.length; i++) {
            
            
            if (stack.isEmpty() || stack.peek() > cars[i][1]) {
                stack.push(cars[i][1]);
            }

        }     

        return stack.size();

        
            
    }
}