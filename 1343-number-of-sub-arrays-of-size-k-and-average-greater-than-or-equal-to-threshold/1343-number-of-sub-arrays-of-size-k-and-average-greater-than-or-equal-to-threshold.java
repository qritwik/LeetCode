class Solution {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int i = 0;
        int j = i + k - 1;
        int sum = 0;
        for (int c = i; c <= j; c++) {
            sum += arr[c];
        }
        int avg = sum / k;
        if (avg >= threshold) count++;
        for (int t = 0; t < arr.length - k; t++) {
            int eleToRemove = arr[t];
            sum -= eleToRemove;
            int eleToAdd = arr[t + k];
            sum += eleToAdd;
            avg = sum / k;
            if (avg >= threshold) count++;
        }
        return count;
    }
}
