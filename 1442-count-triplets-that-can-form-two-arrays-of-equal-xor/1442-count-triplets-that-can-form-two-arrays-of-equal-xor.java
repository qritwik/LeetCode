class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int count = 0;
        for(int i = 0; i <= n-2; i++) {
            for(int j = i+1; j <= n-1; j++) {
                for(int k = j; k <= n-1; k++) {
                    int a = 0;
                    for(int t = i; t <= j-1; t++) {
                        a = a ^ arr[t];
                    }
                    int b = 0;
                    for(int t = j; t <= k; t++) {
                        b = b ^ arr[t];
                    }
                    if (a == b) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}