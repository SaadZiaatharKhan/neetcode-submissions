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
    public int kthSmallest(TreeNode root, int k) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left == null) {
                if (--k == 0) return curr.val;
                curr = curr.right;
            } 
            else {
                TreeNode runner = curr.left;
                while (runner.right != null && runner.right != curr) runner = runner.right;
                if (runner.right == null) {
                    runner.right = curr;
                    curr = curr.left;
                }
                else {
                    runner.right = null;
                    if (--k == 0) return curr.val;
                    curr = curr.right;
                }
            }
        }
        return -1;
    }
}