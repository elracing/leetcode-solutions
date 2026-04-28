// Last updated: 4/28/2026, 10:46:21 AM
class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] memo = new int[nums.length];
        int[] memo2 = new int[nums.length];
        Arrays.fill(memo, -1);
        Arrays.fill(memo2, -1);
        int currentHouse = 0;
        return Math.max(maxMoney(currentHouse, nums, memo, nums.length - 2) , maxMoney(currentHouse + 1, nums, memo2, nums.length - 1));
        
    }

    private int maxMoney(int currentHouse, int[] nums, int[] memo, int end){
        if (currentHouse > end) return 0;
        if (memo[currentHouse] != -1) return memo[currentHouse];

        int skip = maxMoney(currentHouse + 1, nums, memo, end);

        int second = maxMoney(currentHouse + 2, nums, memo, end) + nums[currentHouse];

        memo[currentHouse] = Math.max(skip, second);
        return memo[currentHouse];
    }
}