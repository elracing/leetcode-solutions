// Last updated: 4/28/2026, 10:46:47 AM

class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];

        for(int col = 0; col < board.length; col++) {
            for (int row = 0; row < board[col].length; row++){
                if (board[col][row] == word.charAt(0)){
                    if (dfs(row, col, 0, visited, board, word)) return true;

                }
            }
        }

        return false;                
    }


    public boolean dfs(int x, int y, int index, boolean[][] visited, char[][] board, String word ){

        if (index == word.length()) return true;

        if (x < 0 || 
        y < 0 ||
        x >= board[0].length ||
        y >= board.length ||
        visited[y][x] == true ||
        board[y][x] != word.charAt(index)) return false;

        visited[y][x] = true;
        boolean found = dfs(x + 1, y, index + 1, visited, board, word) ||
        dfs(x - 1, y, index + 1, visited, board, word) ||
        dfs(x, y + 1, index + 1, visited, board, word) ||
        dfs(x, y - 1, index + 1, visited, board, word);

        visited[y][x] = false;

        return found;

    }
}