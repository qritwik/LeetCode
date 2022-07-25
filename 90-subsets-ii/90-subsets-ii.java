class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        return subsetsWithDupHelper(nums, 0);
    }
    
    public List<List<Integer>> subsetsWithDupHelper(int[] nums, int si) {
        List<List<Integer>> result = new ArrayList<>();
        if(si == nums.length) {
            List<Integer> list = new ArrayList<>();
            result.add(list);
            return result;
        }
        
        List<List<Integer>> smallAns = subsetsWithDupHelper(nums, si+1);
        for(List<Integer> list : smallAns) {
            List<Integer> coppiedList = new ArrayList<>(list);
            coppiedList.add(0, nums[si]);
            Collections.sort(list);
            Collections.sort(coppiedList);
            result.add(list);
            result.add(coppiedList);            
        }
        Set<List<Integer>> set = new LinkedHashSet<>();
        set.addAll(result);
        result.clear();
        result.addAll(set);
        return result;
    }
}