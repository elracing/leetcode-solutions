// Last updated: 4/28/2026, 10:46:11 AM
class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int[] arr = new int[26];
        int maxFreq = 0;
        int maxLength = 0;

        for (int end = 0; end < s.length(); end++) {
            char letter = s.charAt(end);

            arr[letter - 'A']++;
            maxFreq = Math.max(maxFreq, arr[letter - 'A']);


            while(end - start + 1 - maxFreq > k) {
                arr[s.charAt(start) - 'A']--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);


        }

        return maxLength;

    }
}