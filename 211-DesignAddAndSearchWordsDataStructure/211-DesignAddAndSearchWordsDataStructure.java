// Last updated: 4/28/2026, 10:46:22 AM
class TrieNode {  
    
    public TrieNode[] children;
    public boolean isWordEnd;

    public TrieNode(){
        children = new TrieNode[26];
        isWordEnd = false;
    }

}

class WordDictionary {
    public TrieNode root;
    

    public WordDictionary() {
        
        root = new TrieNode();
    }
    
    public void addWord(String word) {

        TrieNode cur = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';

            if (cur.children[index] == null) {
                cur.children[index] = new TrieNode();
            }

            cur = cur.children[index];
        }

        cur.isWordEnd = true;
        
    }
    
    public boolean search(String word) {
        return dfs(root, word, 0);



        
    }


    public boolean dfs(TrieNode node, String word, int index){
        if (index == word.length()) {
            return node.isWordEnd;
        }
    
        char c = word.charAt(index);

        if (c != '.') {
            int newIndex = c - 'a';
            if (node.children[newIndex] != null){
                return dfs(node.children[newIndex], word, index + 1);
            }

            else{
                return false;
            }
        }

        else{
            for (TrieNode childNode : node.children) {

                if (childNode != null && dfs(childNode, word, index + 1)) {
                    return true;
                }
            }
        }

        return false;
        
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */