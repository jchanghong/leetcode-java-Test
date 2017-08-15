/**
 * Time : O() ; Space: O()
 * @tag : Design
 * @by  : Steven Cooks
 * @date: Oct 2, 2015
 ***************************************************************************
 * Description:
 * 
 * Given two 1d vectors, implement an iterator to return their elements alternately. 
 * 
 * For example, given two 1d vectors: 
 *  v1 = [1, 2] 
 *  v2 = [3, 4, 5, 6] 
 * By calling next repeatedly until hasNext returns false, the order of elements 
 * returned by next should be: [1, 3, 2, 4, 5, 6]. 
 * 
 * Follow up: What if you are given k 1d vectors? 
 * How well can your code be extended to such cases? 
 * 
 * Clarification for the follow up question - Update (2015-09-18): 
 * The "Zigzag" order is not clearly defined and is ambiguous for k > 2 cases. 
 * If "Zigzag" does not look right to you, replace "Zigzag" with "Cyclic". 
 * For example, given the following input: 
 * 
 *  [1,2,3] 
 *  [4,5,6,7] 
 *  [8,9] 
 * 
 * It should return [1,4,8,2,5,9,3,6,7].
 *
 ***************************************************************************
 * {@link https://leetcode.com/problems/zigzag-iterator/ }
 */
package _281_ZigzagIterator;

import java.util.Iterator;
import java.util.List;

/** see test {@link _281_ZigzagIterator.SolutionTest } */
public class Solution {
    
    Iterator<Integer> i1;
    
    Iterator<Integer> i2;
    
    Iterator<Integer> cur;
    
    public Solution(List<Integer> v1, List<Integer> v2) {
        i1 = v1.iterator();
        i2 = v2.iterator();
        cur = i1;
    }

    public int next() {
        int next = -1;
        if (cur == i1) {
            next = i1.hasNext() ? i1.next() : i2.next();
            cur = i2;
        } else {
            next = i2.hasNext() ? i2.next() : i1.next();
            cur = i1;
        }
        return next;
    }

    public boolean hasNext() {
        return i1.hasNext() || i2.hasNext();
    }

}
