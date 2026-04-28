// Last updated: 4/28/2026, 10:46:27 AM
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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        Deque<TreeNode> queue = new ArrayDeque<>();
        

        if (root != null) queue.addLast(root);


        while(!queue.isEmpty()) {
            
            int size = queue.size();

            for (int i = 0; i < size; i++){
                TreeNode node = queue.removeFirst();
                if (i == size - 1) result.add(node.val);
                if(node.left != null) queue.addLast(node.left);
                if(node.right != null) queue.addLast(node.right);
            }
            
            
        }
        
        return result;
    }



    
}