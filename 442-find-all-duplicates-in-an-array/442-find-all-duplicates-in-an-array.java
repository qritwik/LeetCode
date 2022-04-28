class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        
        for(int i = 0; i < n; i++){
            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx] > 0){
                nums[idx] = nums[idx] * -1;
            }
            else{
                result.add(Math.abs(nums[i]));
            }
        }
        return result;
    }
}