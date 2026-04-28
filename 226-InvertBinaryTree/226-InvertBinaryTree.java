// Last updated: 4/28/2026, 10:46:18 AM
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

 import java.util.Deque;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }

        Deque<TreeNode> queue = new ArrayDeque<>();
        

        queue.addLast(root);

        while (!queue.isEmpty()) {
            TreeNode curNode = queue.removeFirst();
            TreeNode temp = curNode.left;

            curNode.left = curNode.right;
            curNode.right = temp;


            if (curNode.left != null) {
                queue.addLast(curNode.left);
            }

            if (curNode.right != null) {
                queue.addLast(curNode.right);
            }


        }

        return root;
        
    }
}