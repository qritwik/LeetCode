class Solution {
    public String reverseStr(String s, int k) {
        char arr[] = s.toCharArray();
        for(int i = 0; i < arr.length; i = i + 2*k){
            int start = i;
            int end = i + k - 1;
            if(end >= arr.length){
                end = arr.length - 1;
            }
            reverse(arr, start, end);
        }
        return new String(arr);
    }
    
    public void reverse(char[] s, int start, int end){
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}