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
    int sum = 0;

    public int sumNumbers(TreeNode root) {
        sumNumbersHelper(root, "");
        return sum;
    }

    public void sumNumbersHelper(TreeNode root, String path) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            path += String.valueOf(root.val);
            sum += Integer.parseInt(path);
            return;
        }
        sumNumbersHelper(root.left, path+String.valueOf(root.val));
        sumNumbersHelper(root.right, path+String.valueOf(root.val));
    }
}
