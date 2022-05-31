class Solution {
    public int search(int[] nums, int target) {
        
        // calculate index of smallest element
        int l = 0;
        int r = nums.length - 1;
        while(l < r) {
            int m = l + (r - l) / 2;
            if(nums[m] > nums[r]) {
                l = m + 1;
            }
            else {
                r = m;
            }
        }
        
        int s = l;
        l = 0;
        r = nums.length - 1;
        
        if(target >= nums[s] && target <= nums[r]) {
            l = s;
        }
        else {
            r = s - 1;
        }
        
        while(l <= r) {
            int m = l + (r - l) / 2;
            if(nums[m] == target) return m;
            else if(nums[m] > target) r = m - 1;
            else l = m + 1;
        }
        return -1;
    }
}