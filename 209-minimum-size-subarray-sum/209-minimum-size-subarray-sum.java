class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = nums[0];
        int min_len = Integer.MAX_VALUE;
        while(j < nums.length) {
            if(sum < target) {
                j++;
                if(j < nums.length) sum += nums[j];
            }
            else {
                int win_len = j-i+1;
                min_len = Math.min(min_len, win_len);
                sum -= nums[i];
                i++;
            }
        }
        if(min_len == Integer.MAX_VALUE) return 0;
        return min_len;
    }
}