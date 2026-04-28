// Last updated: 4/28/2026, 10:46:17 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return findLCA(root, p , q);
    }

    private TreeNode findLCA(TreeNode node, TreeNode p, TreeNode q){
        if (p.val > node.val && q.val > node.val) {
            return findLCA(node.right, p, q);
        }

        if (p.val < node.val && q.val < node.val){
            return findLCA(node.left, p, q);
        }

        return node;

    }
}