class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int si = 0, max = 0, i = 0;
        for(i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!map.containsKey(ch) || map.get(ch) < si) {
                map.put(ch, i);
            }
            else {
                int len = i - si;
                max = Math.max(len, max);
                si = map.get(ch) + 1;
                map.put(ch, i);
            }
        }
        int len = i - si;
        max = Math.max(len, max);
        return max;
    }
}