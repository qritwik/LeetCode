class Solution {

    public int[] maxSlidingWindow(int[] A, int B) {
        int i = 0;
        int j = 0;
        Deque<Integer> deque = new LinkedList<Integer>();
        int[] result = new int[A.length - B + 1];
        int k = 0;
        while (j < A.length) {
            while (!deque.isEmpty() && A[deque.peekLast()] < A[j]) {
                deque.pollLast();
            }
            deque.add(j);
            if (j - i + 1 < B) {
                j++;
            } else if (j - i + 1 == B) {
                int mi = deque.peek();
                result[k++] = A[mi];
                while (!deque.isEmpty() && deque.peek() <= i) {
                    deque.poll();
                }
                i++;
                j++;
            }
        }
        return result;
    }
}
