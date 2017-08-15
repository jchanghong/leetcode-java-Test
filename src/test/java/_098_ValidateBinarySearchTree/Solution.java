/**
 * Time : O(); Space: O()
 * @tag : Tree; Depth-first Search
 * @by  : Steven Cooks
 * @date: Jun 17, 2015
 *************************************************************************
 * Description:
 * 
 *  Given a binary tree, determine if it is a valid binary search tree (BST). 
 *  Assume a BST is defined as follows: 
 *  
 *  The left subtree of a node contains only nodes with keys less than the node's key. 
 *  The right subtree of a node contains only nodes with keys greater than the node's key. 
 *  Both the left and right subtrees must also be binary search trees.
 *  
 *************************************************************************
 * {@link https://leetcode.com/problems/validate-binary-search-tree/ }
 */
package _098_ValidateBinarySearchTree;

import com.leetcode.TreeNode;

/** see test {@link _098_ValidateBinarySearchTree.SolutionTest } */
public class Solution {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }
        if ((min != null && root.val <= min) || (max != null && root.val >= max)) {
            return false;
        }
        return isValidBST(root.left, min, root.val) 
                && isValidBST(root.right, root.val, max);
    }

}
