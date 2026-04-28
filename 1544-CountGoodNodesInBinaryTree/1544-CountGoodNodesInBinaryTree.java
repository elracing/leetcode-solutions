// Last updated: 4/28/2026, 10:45:52 AM
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
    public int goodNodes(TreeNode root) {
        
        int max = root.val;

        return countGoodNodes(root, max);
        
        
    }

    private int countGoodNodes(TreeNode node, int max){
        if (node == null) return 0;
        int goodNodes = 0;

        if(node.val >= max){
            goodNodes++;
            max = node.val;
        }

        return goodNodes + countGoodNodes(node.left, max) + countGoodNodes(node.right, max);


    }
}