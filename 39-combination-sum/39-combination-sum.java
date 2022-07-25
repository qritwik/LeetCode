class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        combinationSumHelper(candidates, 0, output, target, result);
        return result;
    }
    
    public void combinationSumHelper(int[] candidates, int si, List<Integer> output,
                                    int target, List<List<Integer>> result) {
        if(target == 0) {
            result.add(new ArrayList<>(output));
            return;
        }
        
        if(target < 0 || si == candidates.length) {
            return;
        }
        
        output.add(candidates[si]);
        combinationSumHelper(candidates, si, output, target-candidates[si], result);
        
        output.remove(output.size()-1);
        combinationSumHelper(candidates, si+1, output, target, result);
    }
}