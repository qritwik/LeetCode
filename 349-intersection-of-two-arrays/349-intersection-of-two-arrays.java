class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int res[] = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            map.put(nums1[i], 1);
        }
        
        for(int i = 0; i < nums2.length; i++){
            
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) == 1){
                
                res[k++] = nums2[i];
                map.put(nums2[i], -1);
                
            }
        }
        
        int out[] = new int[k];
        for(int i = 0; i < k; i++){
            out[i] = res[i];
        }
        
        return out;
        
    }
}