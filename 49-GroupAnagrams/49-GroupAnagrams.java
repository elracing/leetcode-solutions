// Last updated: 4/28/2026, 10:46:55 AM
import java.util.HashMap;
import java.util.LinkedList;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, LinkedList<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>(); 

        for (int i = 0; i < strs.length; i++) {

            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.putIfAbsent(key, new LinkedList<String>());
        
            map.get(key).add(strs[i]);

            
        }


        return new ArrayList<>(map.values());
        
        
    }
}