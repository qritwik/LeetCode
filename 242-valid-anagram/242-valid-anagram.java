class Solution {
    public boolean isAnagram(String s, String t) {
        int bucket[] = new int[26];
        for(char ch : s.toCharArray()) {
            int idx = ch - 97;
            bucket[idx]++;
        }
        for(char ch : t.toCharArray()) {
            int idx = ch - 97;
            bucket[idx]--;
        }
        for(int val : bucket) {
            if(val != 0) {
                return false;
            }
        }
        return true;
    }
}