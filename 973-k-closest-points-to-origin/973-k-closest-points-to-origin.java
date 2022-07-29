class Solution {

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(
            (p1, p2) -> {
                double p1d = Math.sqrt(Math.pow(p1.x - 0, 2) + Math.pow(p1.y - 0, 2));
                double p2d = Math.sqrt(Math.pow(p2.x - 0, 2) + Math.pow(p2.y - 0, 2));
                if (p1d < p2d) return -1;
                return 1;
            }
        );

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            Pair p = new Pair(x, y);
            pq.add(p);
        }

        int i = 0;
        int[][] out = new int[k][2];
        Pair temp = null;
        while (i < k) {
            temp = pq.poll();
            out[i][0] = temp.x;
            out[i][1] = temp.y;
            i++;
        }

        return out;
    }
}

class Pair {
    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
