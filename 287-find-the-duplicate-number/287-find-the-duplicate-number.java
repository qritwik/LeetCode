class Solution {
    public int findDuplicate(int[] nums) {
        
        int out = -1;
        for(int i = 0; i < nums.length; i++){
            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx] < 0){
                out = Math.abs(nums[i]);
                break;
            }
            else{
                nums[idx] = nums[idx] * -1;
            }
        }
        return out;
    }
}