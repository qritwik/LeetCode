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

    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            boolean a = false;
            boolean b = false;
            for (int i = 0; i < n; i++) {
                TreeNode front = queue.remove();
                if (front.val == x) a = true;
                if (front.val == y) b = true;
                if (front.left != null && front.right != null) {
                    if (front.left.val == x && front.right.val == y) {
                        return false;
                    }
                    if (front.left.val == y && front.right.val == x) {
                        return false;
                    }
                }
                if (front.left != null) queue.add(front.left);
                if (front.right != null) queue.add(front.right);
            }
            if (a && b) return true;
        }
        return false;
    }
}
