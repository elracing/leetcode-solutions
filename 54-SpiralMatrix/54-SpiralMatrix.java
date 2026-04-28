// Last updated: 4/28/2026, 10:46:54 AM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        int layers = matrix.length;
        int middle = (int)Math.ceil(layers/2.0);

        int curColumnLimit = matrix[0].length - 1;
        int curRowLimit = matrix.length - 1;
        int curColumnStart = 0;

        for (int layer = 0; layer <= middle; layer++){

            if (curColumnStart > curColumnLimit || layer > curRowLimit) break;



            for (int i = curColumnStart; i <= curColumnLimit; i++){
                list.add(matrix[layer][i]);
            }

            for (int i = layer + 1; i <= curRowLimit ; i++){
                list.add(matrix[i][curColumnLimit]);
            }

            if (layer < curRowLimit){

                for (int i = curColumnLimit - 1; i >= curColumnStart ; i--){
                    list.add(matrix[curRowLimit][i]);
                }
            }

            if (curColumnStart < curColumnLimit){

                for (int i = curRowLimit - 1; i > layer; i--){
                    list.add(matrix[i][curColumnStart]);
                }
            }

            curColumnLimit--;
            curRowLimit--;
            curColumnStart++;
            
        }

        return list;
        
    }
}