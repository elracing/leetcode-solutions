// Last updated: 4/28/2026, 10:46:39 AM
class Solution {
    public boolean isPalindrome(String s) {

        String trimmed = s.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase();

        
        for (int i = 0; i < trimmed.length() / 2; i++) {
            char start = trimmed.charAt(i);
            char end = trimmed.charAt(trimmed.length() -1 -i);
            if (start != end) {
                return false;
            }
        }

        return true;
        
    }
    
}