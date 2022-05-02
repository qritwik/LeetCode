class Solution {
    public int findShortestSubArray(int[] nums) {
        
        HashMap<Integer,Integer> first_seen = new HashMap<>();
        HashMap<Integer,Integer> num_counts = new HashMap<>();
        int deg = 0;
        int len = 0;
        
        for(int i = 0; i < nums.length; i++) {
            first_seen.putIfAbsent(nums[i], i);
            num_counts.put(nums[i], num_counts.getOrDefault(nums[i], 0) + 1);
            
            if(num_counts.get(nums[i]) > deg) {
                deg = num_counts.get(nums[i]);
                len = i - first_seen.get(nums[i]) + 1;
            }
            else if(num_counts.get(nums[i]) == deg) {
                len = Math.min(len, i - first_seen.get(nums[i]) + 1);
            }
        }
        return len;
    }
}