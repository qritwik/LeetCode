class Solution {

    public int longestSubstring(String s, int k) {
        Map<Character, Integer> m = new HashMap<>();
        for (char c : s.toCharArray()) m.put(c, m.getOrDefault(c, 0) + 1);

        int count = 0;
        while (count < s.length() && m.get(s.charAt(count)) >= k) count++;

        if (count == s.length()) return count;

        int left = longestSubstring(s.substring(0, count), k);
        int right = longestSubstring(s.substring(count + 1), k);

        return Math.max(left, right);
    }
}
