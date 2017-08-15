/**
 * @tag : Data Structure; Trie
 * @by  : Steven Cooks
 * @date: Jun 25, 2015
 *************************************************************************
 * Implement a trie with insert, search, and startsWith methods. 
 * 
 * Note: 
 * You may assume that all inputs are consist of lowercase letters a-z.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/implement-trie-prefix-tree/ }
 */
package _208_ImplementTriePrefixTree;

import java.util.HashMap;
import java.util.Map;

/** see test {@link _208_ImplementTriePrefixTree.SolutionTest } */
public class Solution {

    private TrieNode root;

    public Solution() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!node.children.containsKey(ch)) {
                node.children.put(ch, new TrieNode(ch));
            }
            node = node.children.get(ch);
        }
        // there is a word ending here
        node.end = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            if (!node.children.containsKey(ch)) {
                return false;
            }
            node = node.children.get(ch);
        }
        // reached to the end of any word?
        return node.end;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    // Note, does not need to check 'sub-word' in 'word'
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (!node.children.containsKey(ch)) {
                return false;
            }
            node = node.children.get(ch);
        }
        return true;
    }

    class TrieNode {
        // Initialize your data structure here.

        /** character stored in this node */
        public char letter;

        /** whether there is a word in trie ending at this node */
        public boolean end;

        /** use map in order to lookup in O(1) time */
        public Map<Character, TrieNode> children = new HashMap<>();

        public TrieNode() {
            letter = ' ';
            end = false;
        }

        public TrieNode(char ch) {
            end = false;
        }
    }

}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
