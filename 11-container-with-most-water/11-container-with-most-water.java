class Solution {
    public int maxArea(int[] height) {
        
        int max = 0;
        int start = 0;
        int end = height.length - 1;
        while(start < end) {
            int vol = Math.min(height[start], height[end]) * (end - start);
            if(vol > max) {
                max = vol;
            }
            if(height[start] < height[end]) {
                start++;
            }
            else if(height[end] < height[start]) {
                end--;
            }
            else {
                start++;
                end--;
            }
        }
        return max;
    }
}