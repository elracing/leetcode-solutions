// Last updated: 4/28/2026, 10:45:55 AM
class Solution {
    public int twoCitySchedCost(int[][] costs) {

        Arrays.sort(costs, (a, b) -> (a[0] - a[1]) - (b[0] - b[1]));

        int totalCost = 0;

        for (int i = 0; i < costs.length / 2; i++){


    
            totalCost += costs[i][0];
        }

        for (int i = costs.length/2; i < costs.length; i++){


    
            totalCost += costs[i][1];
        }

        

        return totalCost;
        
    }
}