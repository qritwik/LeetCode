class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        int max_num = Integer.MIN_VALUE;
        int num = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max_num) {
                max_num = entry.getValue();
                num = entry.getKey();
            } else if (entry.getValue() == max_num) {
                if (entry.getKey() < num) {
                    num = entry.getKey();
                }
            }
        }
        return num;
    }
}
