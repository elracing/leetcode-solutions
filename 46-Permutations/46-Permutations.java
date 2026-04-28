// Last updated: 4/28/2026, 10:46:57 AM
class Solution {

    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        backtrack(used, nums, new ArrayList<>());

        return result;
        
    }


    public void backtrack(boolean[] used, int[] nums, List<Integer> path) {
        if (path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }


        for (int i = 0; i < nums.length; i++){
            //add
            if (used[i]) continue;


            if(used[i] == false) {
                path.add(nums[i]);
                used[i] = true;
            }

            //backtrack
            backtrack(used, nums, path);

            //remove
            used[i] = false;
            path.remove(path.size() - 1);

        }


    


    }
}