class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        HashSet<List<Integer>> result = new HashSet<>();
        List<Integer> out = new ArrayList<>();
        combinationSum2Helper(candidates, 0, out, target, result);
        List<List<Integer>> arr = new ArrayList<>(result);
        return arr;
    }

    public void combinationSum2Helper(int[] candidates, int si, List<Integer> out, int target, HashSet<List<Integer>> result) {
        if (target == 0) {
            List<Integer> t = new ArrayList<>(out);
            result.add(t);
            return;
        }
        if (target < 0 || si == candidates.length) {
            return;
        }
        out.add(candidates[si]);
        combinationSum2Helper(candidates, si + 1, out, target - candidates[si], result);
        out.remove(out.size() - 1);
        while (si + 1 < candidates.length && candidates[si] == candidates[si + 1]) si += 1;
        combinationSum2Helper(candidates, si + 1, out, target, result);
    }
}
