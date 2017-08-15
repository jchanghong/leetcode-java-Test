/**
 * Time : O() ; Space: O()
 * @tag : Backtracking; String
 * @by  : Steven Cooks
 * @date: Aug 25, 2015
 ***************************************************************************
 * Description:
 * 
 * Replace '?' in given string, and '?' can be replaced with either J or K,
 * return all possible replaced string.
 * 
 ***************************************************************************
 * {@link }
 */
package s11_ReplacePermutation;

import java.util.ArrayList;
import java.util.List;

/** see test {@link s11_ReplacePermutation.SolutionTest } */
public class Solution {

    private static final char[] REPLACE = { 'J', 'K' };

    public List<String> replace(String s) {
        List<String> res = new ArrayList<>();
        replace(s, 0, new StringBuilder(s), res);
        return res;
    }

    private void replace(String s, int index, StringBuilder sb, List<String> res) {
        // find the next ? in string
        int i = index;
        while (i < s.length() && s.charAt(i) != '?') {
            i++;
        }
        if (i == s.length() ) {
            res.add(sb.toString());
        } else {
            for (char ch : REPLACE) {
                sb.setCharAt(i, ch);
                replace(s, i + 1, sb, res);
            }
        }
    }

}
