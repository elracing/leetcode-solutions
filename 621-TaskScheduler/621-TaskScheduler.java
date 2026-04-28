// Last updated: 4/28/2026, 10:46:07 AM
class Solution {
    public int leastInterval(char[] tasks, int n) {

        int maxFreq = 0;
        int maxRepeatLetters = 0;

        int[] letters = new int[26];

        for (int i = 0; i < tasks.length; i++){
            letters[tasks[i] - 'A']++;
        }

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > maxFreq) {
                maxFreq = letters[i];
                maxRepeatLetters = 1;
            }

            else if (letters[i] == maxFreq) {
                maxRepeatLetters++;
            }
        }

        return Math.max( tasks.length,(maxFreq - 1) * (n + 1) + (maxRepeatLetters));
        
    }
}