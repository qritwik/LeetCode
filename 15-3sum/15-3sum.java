class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> set = new ArrayList<>();
        for(int i = 0; i <= n-3; i++) {
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
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
                    
                    while(start < end && nums[start] == nums[start-1]){
                        start++;
                    }
                    
                    
                }
                else if(nums[start] + nums[end] < target) {
                    start++;
                }
                else {
                    end--;
                }
            }
        }
        return set;
    }
}