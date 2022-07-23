class Solution {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] left = new int[n];
        int prod_left = 1;
        for (int i = 0; i < n; i++) {
            left[i] = prod_left;
            prod_left = prod_left * nums[i];
        }

        int[] right = new int[n];
        int prod_right = 1;
        for (int i = n - 1; i >= 0; i--) {
            right[i] = prod_right;
            prod_right = prod_right * nums[i];
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }
}
