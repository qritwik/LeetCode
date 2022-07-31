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

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left == null && root.right == null) return true;

        if (isValidBST(root.left) && isValidBST(root.right) && getMax(root.left) < root.val && getMin(root.right) > root.val) {
            return true;
        } else {
            return false;
        }
    }

    public long getMax(TreeNode root) {
        if (root == null) {
            return Long.MIN_VALUE;
        }
        if (root.left == null && root.right == null) {
            return root.val;
        }
        long l = getMax(root.left);
        long r = getMax(root.right);
        return Math.max(root.val, Math.max(l, r));
    }

    public long getMin(TreeNode root) {
        if (root == null) {
            return Long.MAX_VALUE;
        }
        if (root.left == null && root.right == null) {
            return root.val;
        }
        long l = getMin(root.left);
        long r = getMin(root.right);
        return Math.min(root.val, Math.min(l, r));
    }
}
