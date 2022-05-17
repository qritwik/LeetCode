class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int start = 0;
        int end = n-1;
        int out[] = new int[2];
        while(start < end) {
            int sum = numbers[start] + numbers[end];
            if(sum == target) {
                out[0] = start+1;
                out[1] = end+1;
                break;
            } else if(sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return out;
    }
}