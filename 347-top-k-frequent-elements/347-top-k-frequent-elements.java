class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> map.get(b) - map.get(a));
        for(int key : map.keySet()) {
            pq.add(key);
        }
        
        int count = 0;
        int res[] = new int[k];
        while(count < k) {
            res[count] = pq.poll();
            count++;
        }
        return res;
    }
}

