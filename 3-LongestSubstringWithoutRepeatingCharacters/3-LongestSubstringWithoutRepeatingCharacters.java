// Last updated: 4/28/2026, 10:47:08 AM
import java.util.HashSet;


class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int start = 0;
        int maxLength = 0;

        for (int end = 0; end < s.length(); end++){
            Character letter = s.charAt(end);
            while (set.contains(letter)) {
                set.remove(s.charAt(start));
                start++;
            }

            set.add(letter);
            maxLength = Math.max(maxLength , end - start + 1);
        }

        return maxLength;




        
        
    }
}