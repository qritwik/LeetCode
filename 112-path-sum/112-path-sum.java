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
    boolean flag;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        flag = false;
        hasPathSumHelper(root, 0, targetSum);
        return flag;
    }
    
    public void hasPathSumHelper(TreeNode root, int sum, int targetSum) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            sum+=root.val;
            if(sum == targetSum) {
                flag = true;
                return;
            }
        } 
        hasPathSumHelper(root.left, sum+root.val, targetSum);
        hasPathSumHelper(root.right, sum+root.val, targetSum);
    }
}