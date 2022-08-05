class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int k = 0;
        while (!queue.isEmpty()) {
            List<Integer> out = new ArrayList<>();
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode front = queue.remove();
                if (k % 2 == 0) {
                    out.add(front.val);
                } else {
                    out.add(0, front.val);
                }
                if (front.left != null) {
                    queue.add(front.left);
                }
                if (front.right != null) {
                    queue.add(front.right);
                }
            }
            result.add(out);
            k++;
        }
        return result;
    }
}
