class Solution {

    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(j < s.length()) {
            insertIntoMap(map, s.charAt(j));
            if(map.size() > j-i+1) {
                j++;
            }
            else if(map.size() == j-i+1) {
                max = Math.max(max, j-i+1);
                j++;
            }
            else {
                removeFromMap(map, s.charAt(i));
                i++;
                removeFromMap(map, s.charAt(j));
            }
        }
        return max;
    }

    public void insertIntoMap(HashMap<Character, Integer> map, char c) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }

    public void removeFromMap(HashMap<Character, Integer> map, char c) {
        if (map.containsKey(c)) {
            if (map.get(c) > 1) {
                map.put(c, map.get(c) - 1);
            } else if (map.get(c) == 1) {
                map.remove(c);
            }
        }
    }
}
