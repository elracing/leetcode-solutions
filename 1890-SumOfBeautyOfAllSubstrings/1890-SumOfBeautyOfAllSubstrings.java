// Last updated: 4/28/2026, 10:45:45 AM

class Solution {
    public int beautySum(String s) {

        int total = 0;

        for (int i = 0; i < s.length(); i++){
            int[] arr = new int[26];

            for (int j = i; j < s.length(); j++){
                arr[s.charAt(j) - 'a']++;
                int max = 0;
                int min = Integer.MAX_VALUE;


                for (int frequency : arr) {
                    if(frequency > 0){
                        max = Math.max(frequency, max);
                        min = Math.min(frequency, min);
                    }
                }

                total += max - min;
            }
            





            
            
        }

        return total;
    
        




    }
}