class Solution {

    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int max_len = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        int zc = 0;
        int zi = -1;
        if (nums[i] == 0) {
            zc = 1;
            zi = 0;
        }
        int len = j - i + 1 - zc;
        max_len = Math.max(max_len, len);
        j++;
        while (j < n) {
            if (nums[j] == 0 && zc == 0) {
                zi = j;
                zc = 1;
            } else if (nums[j] == 0 && zc == 1) {
                i = zi + 1;
                zi = j;
            }
            len = j - i + 1 - zc;
            max_len = Math.max(max_len, len);
            j++;
        }
        if (zc == 0) {
            return max_len - 1;
        }
        return max_len;
    }
}
