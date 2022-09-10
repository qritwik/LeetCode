class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int d = n - k;
        reverse(nums, 0, d-1);
        reverse(nums, d, n-1);
        reverse(nums, 0, n-1);
    }
    
    public void reverse(int[] nums, int si, int ei) {
        while (si < ei) {
            int temp = nums[si];
            nums[si] = nums[ei];
            nums[ei] = temp;
            si++;
            ei--;
        }
    }
}