class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        int out[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            
            int val = target - nums[i];
            
            if(map.containsKey(val)){
                out[0] = i;
                out[1] = map.get(val);
                break;
            }
            else{
                map.put(nums[i], i);
            }
            
        }
        return out;
}
}