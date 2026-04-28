// Last updated: 4/28/2026, 10:46:30 AM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while( left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target ){
                return new int[] {left + 1, right + 1};
            }

            else{
                if (sum < target) {
                    left++;
                }

                else if (sum > target){
                    right--;
                }
            }
        }

        return new int[] {};
    }
}