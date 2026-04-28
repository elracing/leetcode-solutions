// Last updated: 4/28/2026, 10:46:41 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public boolean isBalanced(TreeNode root) {
        int depthDifference = calculateDepth(root);
        
        if (depthDifference == -1) return false;

        else return true;
        
    }

    private int calculateDepth(TreeNode node){

        if(node == null) {
            return 0;
        }

        int left = calculateDepth(node.left);
        int right = calculateDepth(node.right);


        if (left == - 1 || right == - 1 || Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }
}