// Last updated: 4/28/2026, 10:46:03 AM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] memo = new int[cost.length + 1];
        Arrays.fill(memo, -1);
    
        return Math.min(totalCost(0, cost, memo), totalCost(1, cost, memo));
    }


    private int totalCost(int currentStep, int[] cost, int[] memo){
        if (currentStep >= cost.length) return 0;
        if(memo[currentStep] != -1) return memo[currentStep];




        int oneStepCost = totalCost(currentStep + 1, cost, memo);
        int twoStepCost = totalCost(currentStep + 2, cost, memo);

        memo[currentStep] = Math.min(oneStepCost, twoStepCost) + cost[currentStep];

        return memo[currentStep];

    }
}