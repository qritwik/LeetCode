class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int result[] = new int[queries.length]; 
        for(int j = 0; j < queries.length; j++) {
            int query[] = queries[j];
            int x = query[0], y = query[1], r = query[2];
            int count = 0;
            for(int i = 0; i < points.length; i++) {
                int cordX = points[i][0];
                int cordY = points[i][1];
                double distance = Math.sqrt(Math.pow((cordX - x),2) + Math.pow((cordY- y),2));
                if(distance <= r) {
                    count++;
                }
            }
            result[j] = count;
        }
        return result;
    }
}