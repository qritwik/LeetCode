class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = null;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if(!map.containsKey(diff)) {
                map.put(num, i);
            } else {
                res = new int[]{map.get(diff), i};
            }
        }
        return res;
    }
}