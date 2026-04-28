// Last updated: 4/28/2026, 10:46:45 AM
import java.util.HashSet;

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    //HashSet<List<Integer>> added = new HashSet<>();


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        backTrack(0, nums, new ArrayList<>());
        return result;
        
    }

    public void backTrack(int index, int[] nums, List<Integer> path) {


        result.add(new ArrayList<>(path));
        //added.add(new ArrayList<>(path));
        

        for (int i = index; i < nums.length; i++) {
            if ( i > index && nums[i] == nums[i - 1]) continue;

            path.add(nums[i]);

            backTrack(i + 1, nums, path);

            path.remove(path.size() - 1);
        }
    }
}