// Last updated: 4/28/2026, 10:46:10 AM
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
    int maxD = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        if (root == null) return 0;
        
        calcDiameter(root);
        return maxD;

    }

    private int calcDiameter(TreeNode root) {
        if (root == null) return 0;

        int left = calcDiameter(root.left);
        int right = calcDiameter(root.right);

        maxD = Math.max(maxD, left + right);

        return Math.max(left, right) + 1;
    }
}