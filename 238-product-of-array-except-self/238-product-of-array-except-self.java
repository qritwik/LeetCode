class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] out = new int[nums.length];
        int leftProduct = 1;
        for(int i = 0; i < nums.length; i++) {
            leftProduct = leftProduct * nums[i];
            out[i] = leftProduct;
        }
        
        int rightProduct = 1;
        for(int i = nums.length-1; i >= 1; i--) {
            out[i] = out[i-1] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        out[0] = rightProduct;
        return out;
    }
}