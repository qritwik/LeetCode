class Solution {

    public int characterReplacement(String s, int k) {
        int si = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(si), 1);
        int max = 1;

        for (int i = 1; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            int len = i - si + 1;
            if (isValid(map, len, k)) {
                max = Math.max(len, max);
            } else {
                map.put(s.charAt(si), map.get(s.charAt(si)) - 1);
                si++;
                len = i - si + 1;
                if (isValid(map, len, k)) {
                    max = Math.max(len, max);
                }
            }
        }

        return max;
    }

    public boolean isValid(HashMap<Character, Integer> map, int len, int k) {
        int maxVal = 0;
        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            if (val > maxVal) {
                maxVal = val;
            }
        }
        if (len - maxVal <= k) {
            return true;
        } else {
            return false;
        }
    }
}
