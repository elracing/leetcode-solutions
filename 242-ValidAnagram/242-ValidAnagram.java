// Last updated: 4/28/2026, 10:46:15 AM
import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        else{

            int[][] sLetters = new int[26][1];
            //HashMap<Character, Integer> sLetters = new HashMap<Character, Integer>();
            for (int i = 0; i < s.length(); i++) {
                char newLetter = s.charAt(i);

                sLetters[newLetter - 'a'][0]++;

                //sLetters.put(newLetter, sLetters.getOrDefault(newLetter, 0) + 1);

            }

            for (int i = 0; i < t.length(); i++) {
                char newLetterT = t.charAt(i);

                sLetters[newLetterT - 'a'][0]--;

                if(sLetters[newLetterT - 'a'][0] < 0){
                    return false;
                }

            }

            return true;
            
        }
    }
}