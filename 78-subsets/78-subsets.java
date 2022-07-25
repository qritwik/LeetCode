class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return subsetsHelper(nums, 0);
    }
    
    public List<List<Integer>> subsetsHelper(int[] nums, int si) {
        List<List<Integer>> result = new ArrayList<>();
        if(si == nums.length) {
            List<Integer> newList = new ArrayList<>();
            result.add(newList);
            return result;
        }
        
        List<List<Integer>> smallOut = subsetsHelper(nums, si+1);
        
        for(List<Integer> list : smallOut) {
            List<Integer> copyList = new ArrayList<>(list);
            copyList.add(0, nums[si]);
            result.add(list);
            result.add(copyList);
        }
        
        return result;
    }
}