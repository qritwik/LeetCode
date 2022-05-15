class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        for(int ele : set) {
            int leftEle = ele - 1;
            int count = 0;
            if(!set.contains(leftEle)) {
                // Is start of a sequence
                int val = ele;
                while(set.contains(val)) {
                    count++;
                    val++;
                }
            }
            if(count > max) {
                max = count;
            }
        }
        return max;
    }
}