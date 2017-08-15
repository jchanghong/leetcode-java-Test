/**
 ***************************************************************************
 * Description:
 * Given an array of integers, find two numbers such that they add up to 
 * a specific target number. 
 * The function twoSum should return indices of the two numbers such that 
 * they add up to the target, where index1 must be less than index2. 
 * Please note that your returned answers (both index1 and index2) are not 
 * zero-based. 
 * 
 * You may assume that each input would have exactly one solution. 
 * Input: numbers={2, 7, 11, 15}, target=9 
 * Output: index1=1, index2=2
 * 
 ***************************************************************************
 * @tag : Array; Hash Table
 * {@link https://leetcode.com/problems/two-sum/ }
 */
package _001_TwoSum;

import java.util.HashMap;
import java.util.Map;

/** see test {@link _001_TwoSum.PracticeTest } */
public class Practice {

    public int[] twoSum(int[] nums, int target) {
        // TODO Auto-generated method stub
        int[] ints = {0, 0};
        Map<Integer, Integer> v2index = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            int other = target - nums[i];
            if (v2index.containsKey(other)) {
                ints[0] = v2index.get(other) + 1;
                ints[1] = i + 1;
                return ints;
            }
            v2index.put(nums[i], i);
        }
        return ints;
    }

}
