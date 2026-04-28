// Last updated: 4/28/2026, 10:46:28 AM
class Solution {
    public int rob(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        int currentHouse = 0;
        return maxMoney(currentHouse, nums, memo);
        
    }

    private int maxMoney(int currentHouse, int[] nums, int[] memo){
        if (currentHouse >= nums.length) return 0;
        if (memo[currentHouse] != -1) return memo[currentHouse];

        int skip = maxMoney(currentHouse + 1, nums, memo);
        int second = maxMoney(currentHouse + 2, nums, memo) + nums[currentHouse];

        memo[currentHouse] = Math.max(skip, second);
        return memo[currentHouse];
    }
}