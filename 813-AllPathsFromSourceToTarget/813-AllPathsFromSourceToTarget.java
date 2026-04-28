// Last updated: 4/28/2026, 10:46:00 AM
class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        int index = 0;

        
        search(index, graph, new ArrayList<>());
        return result;
        
    }


    public void search(int index, int[][] graph, List<Integer> path){
        path.add(index);


        if (index == graph.length - 1) {
            result.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }

        if (graph[index] == null) {
            return;
        }


        for (int i = 0; i < graph[index].length; i++) {
            search(graph[index][i], graph, path);

        }

        path.remove(path.size() - 1);
    }
}