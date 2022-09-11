class Solution {

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx1 = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx1 = i;
                break;
            }
        }

        int idx2 = -1;
        if(idx1 != -1) {
            for (int j = n - 1; j >= 0; j--) {
            if (nums[j] > nums[idx1]) {
                idx2 = j;
                break;
            }
        }
        }
        
        if (idx1 != -1 && idx2 != -1) {
            swap(nums, idx1, idx2);
            reverse(nums, idx1 + 1, n - 1);
        } else {
            reverse(nums, 0, n - 1);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int low, int high) {
        while (low <= high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
}
