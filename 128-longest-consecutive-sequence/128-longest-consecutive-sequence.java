class Solution {

    public int longestConsecutive(int[] nums) {
        int max_length = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int ele : nums) set.add(ele);
        for (int num : set) {
            int leftNum = num - 1;
            int count = 0;
            if (!set.contains(leftNum)) {
                int val = num;
                while (set.contains(val)) {
                    count++;
                    val++;
                }
            }
            max_length = Math.max(max_length, count);
        }
        return max_length;
    }
}
