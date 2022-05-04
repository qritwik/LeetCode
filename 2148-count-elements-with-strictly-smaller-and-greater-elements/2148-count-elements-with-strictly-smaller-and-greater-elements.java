class Solution {
    public int countElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        if(max == min) return 0;
        
        int min_count = 0;
        for(int num : nums) {
            if(num == min) {
                min_count++;
            }
        }
        
        int max_count = 0;
        for(int num : nums) {
            if(num == max) {
                max_count++;
            }
        }
        
        return nums.length - (min_count + max_count);
    }
}