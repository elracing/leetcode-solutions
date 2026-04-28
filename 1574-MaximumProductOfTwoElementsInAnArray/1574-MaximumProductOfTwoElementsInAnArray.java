// Last updated: 4/28/2026, 10:45:51 AM
class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        int temp = nums[0];

        for (int i = 0; i < nums.length; i++){

            if (nums[i] > max1){
                temp = max1;
                max1 = nums[i];
                
            }

            else if (nums[i] > max2){
                max2 = nums[i];
            }

            if (temp > max2) {
                max2 = temp;
            }

        }

        
        return (max1 - 1) * (max2 - 1);
    }
}