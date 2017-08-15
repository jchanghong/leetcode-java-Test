/**
 * Time : O(N); Space: O(1)
 * @tag : Tree; Depth-first Search
 * @by  : Steven Cooks
 * @date: Aug 26, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a binary tree, determine if it is height-balanced. 
 * For this problem, a height-balanced binary tree is defined as a binary 
 * tree in which the depth of the two subtrees of every node never differ by
 * more than 1.
 *  
 *************************************************************************
 * {@link: https://leetcode.com/problems/balanced-binary-tree/ }
 */
package _110_BalancedBinaryTree;

import com.leetcode.TreeNode;

/** see test {@link _110_BalancedBinaryTree.SolutionTest } */
public class Solution {

    public boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1;
    }
    
    // is tree is balanced, it returns the max depth of tree,
    // return -1 otherwise
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }

}
