class MedianFinder {
    PriorityQueue<Integer> q1;
    PriorityQueue<Integer> q2;

    public MedianFinder() {
        q1 =
            new PriorityQueue<>(
                (a, b) -> {
                    return b - a;
                }
            );
        q2 = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (q1.isEmpty() || num < q1.peek()) {
            q1.add(num);
        } else {
            q2.add(num);
        }
        if (q1.size() > q2.size() + 1) {
            q2.add(q1.poll());
        } else if (q2.size() > q1.size() + 1) {
            q1.add(q2.poll());
        }
    }

    public double findMedian() {
        if (q1.size() > q2.size()) {
            return q1.peek() * 1.0;
        } else if (q2.size() > q1.size()) {
            return q2.peek() * 1.0;
        } else {
            return (q1.peek() + q2.peek()) / 2.0;
        }
    }
}
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
