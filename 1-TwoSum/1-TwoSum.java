// Last updated: 4/28/2026, 10:51:10 AM
import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            

            if (map.containsKey(difference)) {
                return new int []{map.get(difference), i};
            }

            map.put(nums[i], i);
        
        }

        return new int[0];
    }
}