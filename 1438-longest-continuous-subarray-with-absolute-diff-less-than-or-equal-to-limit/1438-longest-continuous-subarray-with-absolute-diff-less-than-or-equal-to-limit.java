class Solution {

    public int longestSubarray(int[] nums, int limit) {
        int max_length = 0;
        int i = 0;
        int j = 0;
        int max = nums[i];
        int min = nums[j];
        int dif = 0;
        int len = j - i + 1;
        while (i < nums.length && j < nums.length) {
            dif = Math.abs(max - min);
            if (dif > limit) {
                i = i + 1;
                j = j + 1;
                Triplet p = getMaxMin(i, j, nums);
                max = p.maximum;
                min = p.minimum;
                len = p.len;
            } else {
                max_length = Math.max(max_length, len);
                j = j + 1;
                if(j < nums.length) {
                    int num_add = nums[j];
                    max = Math.max(max,num_add);
                    min = Math.min(min,num_add);
                    len = j - i + 1;
                }
            }
        }
        return max_length;
    }

    public Triplet getMaxMin(int i, int j, int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int k = Math.min(i, nums.length - 1); k <= Math.min(j, nums.length - 1); k++) {
            max = Math.max(max, nums[k]);
            min = Math.min(min, nums[k]);
        }
        Triplet p = new Triplet(max, min, j - i + 1);
        return p;
    }
}

class Triplet {
    int maximum;
    int minimum;
    int len;

    public Triplet(int maximum, int minimum, int len) {
        this.maximum = maximum;
        this.minimum = minimum;
        this.len = len;
    }
}
