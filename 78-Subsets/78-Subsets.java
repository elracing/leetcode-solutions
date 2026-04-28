// Last updated: 4/28/2026, 10:46:48 AM
class Solution {
    public List<List<Integer>> result = new ArrayList<>();


    public List<List<Integer>> subsets(int[] nums) {

        backtrack(0, nums, new ArrayList<>());
        return result;
    }


    public void backtrack(int index, int[] nums, List<Integer> path) {
        result.add(new ArrayList<>(path));


        for (int i = index; i < nums.length; i++) {

            path.add(nums[i]);

            backtrack(i + 1, nums, path);

            path.remove(path.size() - 1);
        }

    }
}