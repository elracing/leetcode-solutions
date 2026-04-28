// Last updated: 4/28/2026, 10:46:59 AM
import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> set = new HashSet<>();

        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[0].length; col++){
                char entry = board[row][col];

                if(entry != '.') {

                String colKey = entry + " in col" + col;
                String rowKey = entry + " in row " + row;
                String boxKey = entry + " in box " + col / 3 + "/" + row / 3;

                    if (!set.add(colKey) || !set.add(rowKey) || !set.add(boxKey)){
                        return false;
                    }
                }           
            }
        }

        return true;
    }
}