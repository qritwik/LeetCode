class Solution {
    public int countNegatives(int[][] grid) {
        
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            count += getSize(grid[i]);
        }
        return count;
    }
    
    public static int getSize(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int si = -1;
        while(start <= end){
            int mid = start + (end -  start) / 2;
            if(arr[mid] < 0){
                si = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        if(si != -1){
            return arr.length - si;
        }
        else{
            return 0;
        }
    }
    
}