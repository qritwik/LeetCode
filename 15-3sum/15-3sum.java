class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length-3; i++) {
            int target = 0 - nums[i];
            int start = i + 1;
            int end = nums.length - 1;
            while(start < end) {
                int newSum = nums[start] + nums[end];
                if(target == newSum) {
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[start]);
                    res.add(nums[end]);
                    set.add(res);
                    start++;
                    end--;
                    
                }
                else if(newSum < target) {
                    start ++;
                }
                else {
                    end--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}