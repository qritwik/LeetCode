class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int result[] = new int[queries.length]; 
        for(int j = 0; j < queries.length; j++) {
            int query[] = queries[j];
            int x = query[0], y = query[1], r = query[2];
            int count = 0;
            for(int i = 0; i < points.length; i++) {
                if(radius2(x, y, points[i]) <= r*r) {
                    count++;
                }
            }
            result[j] = count;
        }
        return result;
    }
    public int radius2(int x, int y, int point[]) {
        int x2 = (point[0] - x) * (point[0] - x);
        int y2 = (point[1] - y) * (point[1] - y);
        return x2 + y2;
    }
}