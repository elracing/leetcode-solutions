// Last updated: 4/28/2026, 10:46:52 AM
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>();
        int[] temp = new int[] {intervals[0][0], intervals[0][1]};
        int startB;
        int endB;


        for (int row = 0; row < intervals.length; row++){
            if (row + 1 < intervals.length){

                startB = intervals[row+1][0];
                endB = intervals[row+1][1];    



                if (startB <= temp[1]){
                    temp = new int[]{Math.min(temp[0], startB), Math.max(temp[1], endB)};

                }

                else{
                    list.add(temp);
                    temp = intervals[row + 1];
                
                }


            }

            
        }
        list.add(temp);

        return list.toArray(new int[list.size()][]);



        
        
    }
}