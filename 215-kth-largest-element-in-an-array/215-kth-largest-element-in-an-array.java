class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            return b-a;
        });
        for(int num : nums) pq.add(num);
        
        int temp = 0;
        int i = 0;
        while(i < k) {
            temp = pq.poll();
            i++;
        }
        return temp;
    }
}
