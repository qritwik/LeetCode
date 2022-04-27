class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        
        return result;
    }
}