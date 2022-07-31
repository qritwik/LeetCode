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

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (subRoot == null) return true;
        
        if(isSame(root, subRoot)) return true;

        boolean l = isSubtree(root.left, subRoot);
        boolean r = isSubtree(root.right, subRoot);

        if (l || r) {
            return true;
        } else {
            return false;
        }
    }

    boolean isSame(TreeNode r, TreeNode s) {
        if (r == null && s == null) return true;
        if (r == null || s == null) return false;
        return (r.val == s.val) && isSame(r.left, s.left) && isSame(r.right, s.right);
    }
}
