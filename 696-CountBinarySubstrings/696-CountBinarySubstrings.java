// Last updated: 4/28/2026, 10:46:05 AM
class Solution {
    public int countBinarySubstrings(String s) {
        if (s.length() == 1) return 0;

        List<Integer> list = new ArrayList<>();
        int curRow = 1;
        char last = s.charAt(0);
        int result = 0;

        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) == last) {
                curRow++;
            }

    

            else{
                list.add(curRow);
                curRow = 1;
                last = s.charAt(i);
            }
        }

        list.add(curRow);

        for (int i = 0; i < list.size() - 1; i++){
            result += Math.min(list.get(i), list.get(i + 1));
        }

        return result;

        
    }
}