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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int ps = 0;
        int pe = preorder.length - 1;
        int is = 0;
        int ie = inorder.length - 1;
        return buildTreeHelper(preorder, ps, pe, inorder, is, ie);   
    }
    
    public TreeNode buildTreeHelper(int[] preorder, int ps, int pe, int[] inorder, int is, int ie) {
        if(ps > pe || is > ie){
            return null;
        }
        
        int rootVal = preorder[ps];
        TreeNode root = new TreeNode(rootVal);
        
        int k = -1;
        for(int i = is; i <= ie; i++) {
            if(inorder[i] == rootVal) {
                k = i;
            }
        }
        
        root.left = buildTreeHelper(preorder, ps+1, ps+k-is, inorder, is, k-1);
        root.right = buildTreeHelper(preorder, ps+k-is+1, pe, inorder, k+1, ie);
        return root;
    }
}