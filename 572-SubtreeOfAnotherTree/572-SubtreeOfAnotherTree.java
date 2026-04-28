// Last updated: 4/28/2026, 10:46:08 AM
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;

        if (isDifferent(root, subRoot)) return true;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        
        
    }


    private boolean isDifferent(TreeNode nodeA, TreeNode nodeB) {



        if (nodeA == null && nodeB == null) return true;
        if (nodeA == null || nodeB == null) return false;
        if (nodeA.val != nodeB.val) return false;


        return isDifferent(nodeA.left, nodeB.left) && isDifferent(nodeA.right, nodeB.right);
    }
}