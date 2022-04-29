class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int n = nums.length;
        int si = -1;
        int li = -1;
        
        int start = 0;
        int end = n -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target) {
                si = mid;
                end = mid - 1;
            }
            else if(nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        
        start = 0;
        end = n -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target) {
                li = mid;
                start = mid + 1;
            }
            else if(nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        
        int res[] = new int[]{si, li};
        return res;
    }
}