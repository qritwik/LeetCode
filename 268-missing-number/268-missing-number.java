class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int fin = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += i;
            fin += nums[i];
        }
        
        sum += n;
        return sum - fin;
    }
}