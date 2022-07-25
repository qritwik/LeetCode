class Solution {

    public List<List<Integer>> permute(int[] nums) {
        return permuteHelper(nums, 0);
    }

    public List<List<Integer>> permuteHelper(int[] nums, int si) {
        List<List<Integer>> result = new ArrayList<>();
        if (si == nums.length) {
            List<Integer> tempList = new ArrayList<>();
            result.add(tempList);
            return result;
        }

        List<List<Integer>> smallOut = permuteHelper(nums, si + 1);
        for (List<Integer> list : smallOut) {
            for (int i = 0; i < nums.length - si; i++) {
                List<Integer> tempList = new ArrayList<>(list);
                tempList.add(i, nums[si]);
                result.add(tempList);
            }
        }
        return result;
    }
}
