// Last updated: 4/28/2026, 10:46:06 AM
import java.util.Deque;

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        Deque<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean [grid.length][grid[0].length];
        int islandCount = 0;
        int streak = 0;
        int[][] directions = {
            {1,0},
            {0,1},
            {-1,0},
            {0,-1},
        };

        for (int x = 0; x < grid.length; x++){
            for (int y = 0; y < grid[x].length; y++){
                if (grid[x][y] != 0 && !visited[x][y]) {
                    streak = 0;
                    visited[x][y] = true;
                    queue.addLast(new int[] {x, y});

                    while(!queue.isEmpty()){
                        streak++;
                        int[] cell = queue.removeFirst();
                        int xCur = cell[0];
                        int yCur = cell[1];
                        for(int[] d : directions) {
                            int newXCur = xCur + d[0];
                            int newYCur = yCur + d[1];

                            if (newXCur >= 0 && newYCur >= 0 && 
                                newXCur < grid.length && 
                                newYCur < grid[0].length && 
                                grid[newXCur][newYCur] != 0 && 
                                !visited[newXCur][newYCur]){

                                visited[newXCur][newYCur] = true;
                                queue.addLast(new int[] {newXCur, newYCur});

                            }
                        }

                        if (streak > islandCount) {
                            islandCount = streak;
                        }

                    }
                    
                    
                }
            }
            
        }

        return islandCount;
    }
}