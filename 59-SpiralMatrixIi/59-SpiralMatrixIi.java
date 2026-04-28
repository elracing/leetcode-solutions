// Last updated: 4/28/2026, 10:46:51 AM
class Solution {
    public int[][] generateMatrix(int n) {
    
    int[][] matrix = new int[n][n];
    int num = 1;


        int layers = matrix.length;
        int middle = (int)Math.ceil(layers/2.0);

        int curColumnLimit = matrix[0].length - 1;
        int curRowLimit = matrix.length - 1;
        int curColumnStart = 0;

        for (int layer = 0; layer <= middle; layer++){

            if (curColumnStart > curColumnLimit || layer > curRowLimit) break;



            for (int i = curColumnStart; i <= curColumnLimit; i++){
                matrix[layer][i] = num;
                num++;
            }

            for (int i = layer + 1; i <= curRowLimit ; i++){
                matrix[i][curColumnLimit] = num;
                num++;
            }

            if (layer < curRowLimit){

                for (int i = curColumnLimit - 1; i >= curColumnStart ; i--){
                    matrix[curRowLimit][i] = num;
                    num++;
                }
            }

            if (curColumnStart < curColumnLimit){

                for (int i = curRowLimit - 1; i > layer; i--){
                    matrix[i][curColumnStart] = num;
                    num++;
                }
            }

            curColumnLimit--;
            curRowLimit--;
            curColumnStart++;
            
        }

        return matrix;
        
    }
}