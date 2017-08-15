/**
 * Time : O(logN); Space: O(1)
 * @tag : Math; Binary Search
 * @by  : Steven Cooks
 * @date: Jun 5, 2015
 *************************************************************************
 * Description
 * 
 * Implement int sqrt(int x). 
 * Compute and return the square root of x.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/sqrtx/ }
 */
package _069_Sqrtx;

/** see test {@link _069_Sqrtx.SolutionTest } */
public class Solution {

    // find the last value that value*value <= x
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int left = 1;
        int right = x;
        while (left <= right) {
            // avoid potential Stack Overflow caused by (left + right) / 2;
            int half = (right - left) / 2 + left;
            if (half <= x / half && ((half + 1) > x / (half + 1))) {
                return half;
            } else if (half > x / half) {
                // instead of (half * half) > x to avoid stack overflow
                right = half - 1;
            } else {
                left = half + 1;
            }
        }
        return left;
    }

}
