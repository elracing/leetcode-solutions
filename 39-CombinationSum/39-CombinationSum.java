// Last updated: 4/28/2026, 10:46:58 AM
class Solution {
    List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<Integer> path = new ArrayList<>();

        backtrack(candidates, 0, target, path, 0);

        return results;
    }

    public void backtrack(int[] candidates, int start, int target, List<Integer> path, int total){

        if(total == target){
            results.add(new ArrayList<>(path));

        }

        else if (total > target){
            return;
        }

        for (int i = start; i < candidates.length; i++){

            //add
            path.add(candidates[i]);

            //backtrack
            backtrack(candidates, i, target, path, total + candidates[i]);

            //remove
            path.remove(path.size() - 1);
        }
        


    }
}