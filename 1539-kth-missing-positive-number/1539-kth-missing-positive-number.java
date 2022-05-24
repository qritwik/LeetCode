class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr) set.add(num);
        
        int count = 0;
        for(int i = 1; i <= arr[arr.length - 1]; i++) {
            if(!set.contains(i)) count++;
            if(count == k) return i;
        }
        return arr[arr.length - 1] + k - count;
    }
}