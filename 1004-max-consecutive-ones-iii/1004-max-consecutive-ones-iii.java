class Solution {

    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int si = 0;
        int zero = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                pq.add(i);
                zero++;
            }
            if (zero <= k) {
                int len = i - si + 1;
                max = Math.max(len, max);
            } else {
                if (nums[si] == 0) {
                    si++;
                } else {
                    si = pq.peek() + 1;
                }
                pq.poll();
                zero--;
                int len = i - si + 1;
                max = Math.max(len, max);
            }
        }
        return max;
    }
}
