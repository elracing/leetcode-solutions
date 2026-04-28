// Last updated: 4/28/2026, 10:45:54 AM
class Solution {
    public List<String> removeAnagrams(String[] words) {

        if (words.length == 1) return Arrays.asList(words[0]);

        char[] cArray = words[0].toCharArray();
        Arrays.sort(cArray);
        String lastWord = new String(cArray);

        List<String> anagrams = new ArrayList<>();
        anagrams.add(words[0]);


        for (int i = 1 ; i < words.length; i++){
        
                
            char[] cArray2 = words[i].toCharArray();
            Arrays.sort(cArray2);
            String nextWord = new String(cArray2);

            if (!nextWord.equals(lastWord)){
                anagrams.add(words[i]);
                lastWord = nextWord;

            }


        }

        return anagrams;

        
    }
}