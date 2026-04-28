// Last updated: 4/28/2026, 10:46:50 AM
class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return climbingWays(n, memo);

    }


    private int climbingWays(int n, int[] memo) {
        if (n <= 1) return 1;

        if (memo[n] != -1) return memo[n];

        memo[n] = climbingWays(n - 1, memo) + climbingWays(n - 2, memo);

        return memo[n];
    }
}