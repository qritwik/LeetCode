class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length-3; i++) {
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
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
                    list.add(res);
                    start++;
                    end--;
                    while(start < end && nums[start] == nums[start-1]){
                        start++;
                    }
                }
                else if(newSum < target) {
                    start ++;
                }
                else {
                    end--;
                }
            }
        }
        return list;
    }
}