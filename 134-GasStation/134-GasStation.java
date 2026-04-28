// Last updated: 4/28/2026, 10:46:37 AM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int start = 0;
        int total = 0;
        int gasTank = 0;


        for (int i = 0; i < gas.length; i++){
            gasTank += gas[i] - cost[i];
            total += gas[i] - cost[i];

            if (gasTank < 0) {
                start = i + 1;
                gasTank = 0;
            }

        }

        return total >= 0 ? start : -1;
        
    }
}