// Last updated: 4/28/2026, 10:46:42 AM
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
    public int maxDepth(TreeNode root) {

        if (root == null){
            return 0;
        }

        return depthCount(root);


        
    }

    private int depthCount(TreeNode curNode){
        if (curNode == null) {
            return 0;
        }


        int leftDepth = depthCount(curNode.left);
        int rightDepth = depthCount(curNode.right);

        return Math.max(leftDepth, rightDepth) + 1;

    }
}