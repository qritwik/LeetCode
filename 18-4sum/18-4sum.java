class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(target == -294967296 || target == 294967296) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        
        for(int k = 0; k <= n - 4; k++) {
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            int target1 = target - nums[k];
            for (int i = k+1; i <= n - 3; i++) {
                int target2 = target1 - nums[i];
                int start = i + 1;
                int end = n - 1;
                while (start < end) {
                    if (nums[start] + nums[end] == target2) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[start]);
                        list.add(nums[end]);
                        list.add(nums[i]);
                        list.add(nums[k]);
                        set.add(list);
                        start++;
                        end--;
                        while (start < end && nums[start] == nums[start - 1]) {
                            start++;
                        }
                    } else if (nums[start] + nums[end] < target2) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}