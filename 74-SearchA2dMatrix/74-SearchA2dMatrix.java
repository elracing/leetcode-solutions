// Last updated: 4/28/2026, 10:46:49 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n * m - 1;


        while (left <= right) {
            int middle = left + (right - left) / 2;
            int row = middle / n;
            int col = middle % n;
            int num = matrix[row][col];

            if (num == target) return true;


            if (num < target){
                left = middle + 1;
            }

            else{
                right = middle - 1;
            }
        }

        return false;
    }
}