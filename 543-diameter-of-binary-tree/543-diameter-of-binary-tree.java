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

    public int diameterOfBinaryTree(TreeNode root) {
        Pair resultPair = diameterOfBinaryTreeHelper(root);
        return resultPair.diameter;
    }

    public Pair diameterOfBinaryTreeHelper(TreeNode root) {
        if (root == null) {
            Pair p = new Pair(0, 0);
            return p;
        }

        Pair leftPair = diameterOfBinaryTreeHelper(root.left);
        Pair rightPair = diameterOfBinaryTreeHelper(root.right);

        int d = Math.max(Math.max(leftPair.diameter, rightPair.diameter), leftPair.height + rightPair.height);
        int h = 1 + Math.max(leftPair.height, rightPair.height);
        Pair p1 = new Pair(h, d);
        return p1;
    }
}

class Pair {
    int height;
    int diameter;

    public Pair(int height, int diameter) {
        this.height = height;
        this.diameter = diameter;
    }
}
