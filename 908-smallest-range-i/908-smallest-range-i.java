class Solution {
    public int smallestRangeI(int[] nums, int k) {
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }
        
        int temp1 = max-k;
        int temp2 = min+k;
        
        if(temp2 >= temp1){
            return 0;
        }
        else{
            return temp1 - temp2;
        }
        
    }
}