class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int dif = target - nums[i];
            if(!map.containsKey(dif)) {
                map.put(nums[i], i);
            }
            else {
                return new int[]{map.get(dif), i};
            }
        }
        return new int[]{0, 0};
    }
}