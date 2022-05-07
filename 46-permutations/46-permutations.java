class Solution {
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> asf = new ArrayList<>();
        permuteHelper(nums, asf, output);
        return output;
    }
    public void permuteHelper(int[] nums, List<Integer> asf, List<List<Integer>> output) {
        
        if(nums.length == 0) {
            output.add(new ArrayList<>(asf));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            int shortNums[] = new int[nums.length - 1];
            int k = 0;
            for(int j = 0; j < i; j++) {
                shortNums[k++] = nums[j];
            }
            for(int j = i+1; j < nums.length; j++) {
                shortNums[k++] = nums[j];
            }
            
            asf.add(nums[i]);
            permuteHelper(shortNums, asf, output);
            asf.remove(asf.size()-1);
        }
    }
}