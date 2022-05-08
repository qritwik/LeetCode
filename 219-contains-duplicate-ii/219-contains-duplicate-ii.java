class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i <= Math.min(k,nums.length-1); i++) {
            if(!set.add(nums[i])) {
                return true;
            }
        }
        for(int i = k+1; i < nums.length; i++) {
            int numToRemove = nums[i - k - 1];
            set.remove(numToRemove);
            if(!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}