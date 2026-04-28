// Last updated: 4/28/2026, 10:45:43 AM
class Solution {
    public boolean winnerOfGame(String colors) {
        if (colors.length() < 3) return false;

        boolean AliceWins = false;
        int numA = 0;
        int numB = 0;

        for (int i = 1; i < colors.length() - 1; i++){
            char prev = colors.charAt(i - 1);
            char next = colors.charAt(i + 1);
            char cur = colors.charAt(i);

            if (prev == 'A' && prev == cur && cur == next) numA++;
            else if (prev =='B' && prev == cur && cur == next) numB++;

            
        }

        if(numA > numB) return true;

        else return false;



        








        
    }
}