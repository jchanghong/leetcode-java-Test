/**
 * Time : O(N^2); Space: O(N^2)
 * @tag : Dynamic Programming; String
 * @by  : Steven Cooks
 * @date: 04.27.2015 
 *************************************************************************
 * Description:
 * Given two words word1 and word2, find the minimum number of steps 
 * required to convert word1 to word2. (each operation is counted as 1 step.) 
 * 
 * You have the following 3 operations permitted on a word: 
 *  a) Insert a character 
 *  b) Delete a character 
 *  c) Replace a character
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/edit-distance/ }
 */
package _072_EditDistance;

/** see test {@link _072_EditDistance.SolutionTest } */
public class Solution {

    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[] memo = new int[len2 + 1];

        // initialize the memo
        for (int j = 1; j <= len2; j++) {
            // cost for converting from "" to word2.substring(j)
            memo[j] = j;
        }

        for (int i = 1; i <= len1; i++) {
            int prev = i;
            for (int j = 1; j <= len2; j++) {
                int cur = 0;
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    // if chars are equal, no cost for converting
                    cur = memo[j - 1];
                } else {
                    cur = 1 + Math.min(memo[j - 1], Math.min(memo[j], prev));
                }
                memo[j - 1] = prev;
                prev = cur;
            }
            memo[len2] = prev;
        }
        return memo[len2];
    }

}
