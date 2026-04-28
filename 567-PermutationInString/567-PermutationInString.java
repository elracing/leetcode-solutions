// Last updated: 4/28/2026, 10:46:09 AM
class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()){
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        int start = 0;
        int end = 0;

        for (int i = 0; i < s1.length(); i++){
            s1Count[s1.charAt(i) - 'a']++;
        }


        while (end != s2.length()) {
            int letter = s2.charAt(end) - 'a';
            s2Count[letter]++;

            if(end - start + 1 == s1.length()) {
                if(Arrays.equals(s1Count, s2Count)){
                    return true;
                }
                else{
                    int startLetter = s2.charAt(start) - 'a';
                    s2Count[startLetter]--;
                    start++;
                }
            }

            end++;
        }

        return false;

        
    }
}
