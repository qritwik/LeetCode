class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        int total_sum = 0;
        for(int i = 0; i <= n; i++) {
            total_sum += i;
        }
        
        int array_sum = 0;
        for(int j = 0; j < n; j++) {
            array_sum += nums[j];
        }
        
        return total_sum - array_sum;
    }
}