class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m-1;
        int row_idx = 0;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(target >= matrix[mid][0] && target <= matrix[mid][n-1]) {
                row_idx = mid;
                break;
            }
            else if(target > matrix[mid][n-1]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        
        int start = 0;
        int end = n-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(matrix[row_idx][mid] == target) {
                return true;
            }
            else if(matrix[row_idx][mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
    }
}
