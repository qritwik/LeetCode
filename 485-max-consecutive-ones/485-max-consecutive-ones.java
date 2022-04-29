class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int prev = -1;
        int max = Integer.MIN_VALUE;
        
        int i;
        for(i = 0; i < nums.length; i++){
            if(nums[i] != 1){
                int val = (i-1) - prev;
                if(val > max){
                    max = val;
                }
                prev = i;
            }
        }
        int val = (i-1) - prev;
        if(val > max){
            max = val;
        }
        return max;
    }
}