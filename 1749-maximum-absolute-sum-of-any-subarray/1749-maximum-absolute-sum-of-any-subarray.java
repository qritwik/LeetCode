class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        
        int max_sum = Integer.MIN_VALUE;
        int sum1 = 0;
        for(int i = 0; i < n; i++) {
            sum1 += nums[i];
            max_sum = Math.max(max_sum, sum1);
            if(sum1 < 0) sum1 = 0;
        }
        
        int min_sum = Integer.MAX_VALUE;
        int sum2 = 0;
        for(int j = 0; j < n; j++) {
            sum2 += nums[j];
            min_sum = Math.min(min_sum, sum2);
            if(sum2 > 0) sum2 = 0;
        }
        
        return Math.max(max_sum, Math.abs(min_sum));
    }
}