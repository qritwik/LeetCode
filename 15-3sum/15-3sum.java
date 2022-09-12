class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0; i <= n-3; i++) {
            int target = 0 - nums[i];
            int start = i + 1;
            int end = n - 1;
            while(start < end) {
                if(nums[start] + nums[end] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[start]);
                    list.add(nums[end]);
                    list.add(nums[i]);
                    set.add(list);
                    start++;
                    end--;
                }
                else if(nums[start] + nums[end] < target) {
                    start++;
                }
                else {
                    end--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}