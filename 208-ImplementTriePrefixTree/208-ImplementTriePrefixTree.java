// Last updated: 4/28/2026, 10:46:23 AM
class TrieNode {
    public TrieNode[] children;
    public boolean isWordEnd;

    public TrieNode(){
        children = new TrieNode[26];
        isWordEnd = false;
    }
}

class Trie {

    public TrieNode root;

    public Trie() {
        root = new TrieNode();
         
    }

    public void insert(String word) {

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
        TrieNode cur = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';

            if (cur.children[index] == null) {
                return false;
            }

            cur = cur.children[index];
        }

        return cur.isWordEnd;

    }

    public boolean startsWith(String prefix) {

        TrieNode cur = root;

        for (char c : prefix.toCharArray()) {
            int index = c - 'a';

            if (cur.children[index] == null) {
                return false;
            }

            cur = cur.children[index];
        }

        return true;


    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */