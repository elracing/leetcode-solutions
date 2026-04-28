// Last updated: 4/28/2026, 10:46:01 AM
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;


        while (left <= right) {
            int mid = (left + (right - left));

            if (nums[mid] == target){
                return mid;
            }

            else if (nums[mid] < target){
                left = mid + 1;
            }

            else if (nums[mid] > target) {
                right = mid - 1;
            }
        }

        return -1;
        
    }
}