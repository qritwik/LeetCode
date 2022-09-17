public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String binary = Integer.toBinaryString(n);
        char[] arr = binary.toCharArray();
        reverse(arr);
        int len = binary.length();
        String newBinaryStr = new String(arr);
        for(int i = 0; i < 32-len; i++) {
            newBinaryStr = newBinaryStr.concat("0");
        }
        System.out.println(newBinaryStr);
        int res = Integer.parseUnsignedInt(newBinaryStr, 2);
        return res;
    }
    
    public void reverse(char[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}