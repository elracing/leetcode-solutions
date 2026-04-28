// Last updated: 4/28/2026, 10:46:20 AM
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer>checkedNums = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++) {
            if (checkedNums.contains(nums[i])) {
                return true;
            }

            else{
                checkedNums.add(nums[i]);
            }
        }

        return false;
        
    }
}