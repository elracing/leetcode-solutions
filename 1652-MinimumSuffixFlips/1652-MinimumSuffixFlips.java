// Last updated: 4/28/2026, 10:45:48 AM
class Solution {
    public int minFlips(String target) {

        int totalFlips = 0;
        char prev = '0';

        char[] c = target.toCharArray();

        for (int i = 0; i < c.length; i++) {

           char cur = c[i];

           if (cur != prev) {
                if (prev == '1'){
                     prev = '0';
                }

                else if (prev == '0') {
                    prev = '1';
                }

                totalFlips++;
           }

        }

        return totalFlips;


        
    }
}