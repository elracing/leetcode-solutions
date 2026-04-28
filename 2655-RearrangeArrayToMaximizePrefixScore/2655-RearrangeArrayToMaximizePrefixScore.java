// Last updated: 4/28/2026, 10:45:44 AM
class Solution {
    public int maxScore(int[] nums) {
        int score = 0;
        long total = 0;
        Arrays.sort(nums);
        reverse(nums);


        for (int i = 0; i < nums.length ; i++){
            total+= nums[i];
            if (total > 0) score++;
        }

        return score;
    }


    public void reverse(int[] nums){
        for (int i = 0; i < nums.length / 2; i++){

            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        
    }
}