// Last updated: 4/28/2026, 10:46:56 AM
class Solution {
    public void rotate(int[][] matrix) {
        
        int temp = 0;


        for (int i = 0; i < matrix.length; i++){
            for (int j = i + 1; j < matrix[0].length; j++){
                temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++){
            int reverse = matrix[0].length - 1;
            for (int j = 0; j < matrix[0].length / 2; j++){
                temp = matrix[i][reverse];
                matrix[i][reverse] = matrix[i][j];
                matrix[i][j] = temp;
                reverse--;


        
                
            }
        }

        


        
    }
}