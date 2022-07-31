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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int n = queue.size();
            for(int i = 0; i < n; i++) {
                TreeNode front = queue.poll();
                
                if(front.left != null) {
                    queue.add(front.left);
                }
                if(front.right != null) {
                    queue.add(front.right);
                }
                
                list.add(front.val);
            }
            result.add(list);
        }
        return result;
    }
}