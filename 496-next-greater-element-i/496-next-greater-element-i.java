class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int out[] = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
            map.put(nums2[i], i);
        }
        
        for(int i = 0; i < nums1.length; i++){
            int res = -1;
            int ele = nums1[i];
            int idx = map.get(ele);
            for(int j = idx + 1; j < nums2.length; j++){
                if(nums2[j] > ele){
                    res = nums2[j];
                    break;
                }
            }
            out[i] = res;
        }
        return out;
    }
}