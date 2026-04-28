// Last updated: 4/28/2026, 10:47:09 AM
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++){

            int odd = expand(s, i, i);
            int even = expand(s, i, i + 1);

            int maxLength = Math.max(odd,even);

            if (maxLength > end - start) {
                start = i - (maxLength -1) / 2;
                end = i + (maxLength) / 2;
            }
        }

        return s.substring(start, end + 1);        
    }


    private int expand(String s, int start, int end){
        while ((start >= 0 && end < s.length()) && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }

        return end - start - 1;
    }
}