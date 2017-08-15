/**
 * Time : O(NlgN); Space : O(1)
 * @tag : Divide and Conquer; Heap
 * @by  : Steven Cooks
 * @date: Jul 11, 2015
 *******************************************************************************
 * Description: 
 * 
 * Find the kth largest element in an unsorted array. Note that it is the 
 * kth largest element in the sorted order, not the kth distinct element. 
 * 
 * For example, Given [3,2,1,5,6,4] and k = 2, return 5. 
 * Note: You may assume k is always valid, 1 ≤ k ≤ array's length.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/kth-largest-element-in-an-array/  }
 */
package _215_KthLargestElementInAnArray;

import java.util.Arrays;

/** see test {@link _215_KthLargestElementInAnArray.SolutionNlgNTest } */
public class SolutionNlgN {

    // sort array and then find the kth largest number
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

}
