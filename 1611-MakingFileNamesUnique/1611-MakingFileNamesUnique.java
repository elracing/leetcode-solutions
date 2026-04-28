// Last updated: 4/28/2026, 10:45:50 AM
import java.util.HashMap;

class Solution {
    public String[] getFolderNames(String[] names) {

        String[] arr = new String[names.length];
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < names.length; i++){
            
            if(map.containsKey(names[i])) {
                int newVal = map.get(names[i]) + 1;
                map.put(names[i], newVal);

            
                
                String newWord = names[i] + "(" + Integer.toString(newVal) + ")";
                while(map.containsKey(newWord)){
                    newVal++;
                    newWord = names[i] + "(" + Integer.toString(newVal) + ")";
                }
                map.put(newWord, 0);
                arr[i] = newWord;

            }

            else{
                map.put(names[i], 0);
                arr[i] = names[i];

            }
        }

        return arr;
        
    }
}