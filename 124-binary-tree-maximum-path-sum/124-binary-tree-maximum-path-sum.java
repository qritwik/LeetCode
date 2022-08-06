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
    int max_sum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        max_gain(root);
        return max_sum;
    }

    public int max_gain(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(0, max_gain(node.left));
        int right = Math.max(0, max_gain(node.right));
        int new_path = left + right + node.val;
        max_sum = Math.max(max_sum, new_path);
        return Math.max(left, right) + node.val;
    }
}
