public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String binaryString = Integer.toBinaryString(n);
        char[] arr = binaryString.toCharArray();
        int count = 0;
        for(char c : arr) {
            if(c == '1') count++;
        }
        return count;
    }
}