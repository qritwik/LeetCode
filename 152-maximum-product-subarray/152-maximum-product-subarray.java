class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int ma = ans;
        int mi = ans;
        int n = nums.length;
        for(int i = 1; i < n; i++) {
            if(nums[i] < 0) {
                int temp = ma;
                ma = mi;
                mi = temp;
            }
            ma = Math.max(nums[i], nums[i] * ma);
            mi = Math.min(nums[i], nums[i] * mi);
            ans = Math.max(ma, ans);
        }
        return ans;
    }
}