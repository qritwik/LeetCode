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
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> ans = new ArrayList<>();
        pathSumHelper(root, targetSum, ans);
        return result;
    }

    public void pathSumHelper(TreeNode root, int targetSum, List<Integer> ans) {
        if (root == null) return;
        if (root.left == null && root.right == null && root.val == targetSum) {
            List<Integer> lis = new ArrayList<>(ans);
            lis.add(root.val);
            result.add(lis);
            return;
        }
        ans.add(root.val);
        pathSumHelper(root.left, targetSum - root.val, ans);
        pathSumHelper(root.right, targetSum - root.val, ans);
        ans.remove(ans.size() - 1);
    }
}
