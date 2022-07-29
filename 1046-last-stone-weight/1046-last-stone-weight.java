class Solution {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                return b - a;
            }
        );
        for (int stone : stones) pq.add(stone);

        while (pq.size() > 1) {
            int y = pq.poll();
            int x = pq.poll();
            if (x != y) {
                pq.add(y - x);
            }
        }

        if(pq.size() == 0) return 0;
        return pq.peek();
    }
}

/*
2 7 4 1 8 1 
2 4 1 1 => y=8, x=7
2 4 1 1 1
1 1 1 => y=4, x=2
1 1 => y=2, x=1
1 1 1
1 => y=1, x=1
1
*/
