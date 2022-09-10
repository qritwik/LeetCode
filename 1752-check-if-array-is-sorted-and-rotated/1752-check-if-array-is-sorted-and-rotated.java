class Solution {

    public boolean check(int[] nums) {
        int first = nums[0];
        int index = -1;
        int last = nums[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (index == -1) {
                    index = i + 1;
                } else {
                    return false;
                }
            }
        }
        if (last <= first || index == -1) {
            return true;
        } else {
            return false;
        }
    }
}
