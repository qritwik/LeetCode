class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int res[] = new int[nums1.length];
        int k = 0;
        
        for(int i = 0; i < nums1.length; i++) {
            if(map.containsKey(nums1[i])){
                map.put(nums1[i], map.get(nums1[i]) + 1);
            }
            else{
                map.put(nums1[i], 1);
            }
        }
        
        for(int j = 0; j < nums2.length; j++) {
            
            if(map.containsKey(nums2[j]) && map.get(nums2[j]) > 0) {
                res[k++] = nums2[j];
                map.put(nums2[j], map.get(nums2[j]) - 1);
            }
        }
        
        int out[] = new int[k];
        for(int i = 0; i < k; i++){
            out[i] = res[i];
        }
        
        return out;
        
    }
}