class Solution {
    public int findTargetSumWays(int[] nums, int target) {
    
        HashMap<String, Integer> dp = new HashMap<>();
        return func(nums, 0, 0, target, nums.length, dp);
        
    }
    
    public int func(int[] arr, int i, int ssf, int sum, int n, HashMap<String, Integer> dp) {
        if(i == n) {
            if(ssf == sum) {
                return 1;
            }
            return 0;
        }

        String key1 = i + ":" + ssf;
        if(dp.containsKey(key1)) {
            return dp.get(key1);
        }
        
        int out1 = func(arr, i+1, ssf + arr[i], sum, n, dp);
        int out2 = func(arr, i+1, ssf - arr[i], sum, n, dp);
        String key = i + ":" + ssf;
        dp.put(key, out1 + out2);
        return out1 + out2;
    }
}