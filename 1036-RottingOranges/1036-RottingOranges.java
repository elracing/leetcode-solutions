// Last updated: 4/28/2026, 10:45:56 AM
import java.util.ArrayDeque;

class Solution {
    public int orangesRotting(int[][] grid) {

        int fresh = 0;
        int time = 0;

        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int[][] dirs = {
            {0,1}, {0,-1}, {1,0}, {-1,0}
        };

        Deque<int[]> queue = new ArrayDeque<>();

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {

                if (grid[row][col] == 2) {
                    queue.addLast(new int[]{row, col});
                    visited[row][col] = true;
                }

                if (grid[row][col] == 1) {
                    fresh++;
                }
            }
        }

        while (!queue.isEmpty() && fresh > 0) {

            int curSize = queue.size();

            while (curSize > 0) {
                int[] cur = queue.removeFirst();

                int curRow = cur[0];
                int curCol = cur[1];

                for (int[] d : dirs) {
                    int nx = curRow + d[0];
                    int ny = curCol + d[1];

                    
                    if (nx >= 0 && nx < grid.length &&
                        ny >= 0 && ny < grid[0].length &&
                        !visited[nx][ny] &&
                        grid[nx][ny] == 1) {

                        fresh--;
                        visited[nx][ny] = true;
                        grid[nx][ny] = 2;
                        queue.addLast(new int[]{nx, ny});
                    }
                }

                curSize--;
            }

            time++; 
        }

        return fresh == 0 ? time : -1;
    }
}
