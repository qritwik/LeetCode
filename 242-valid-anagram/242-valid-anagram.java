class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap();
        for(char ch1 : s.toCharArray()) {
            map.put(ch1, map.getOrDefault(ch1, 0) + 1); 
        }
        for(char ch2 : t.toCharArray()) {
            if(map.containsKey(ch2)) {
                map.put(ch2, map.get(ch2) - 1);
            } else {
                return false;
            } 
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            if(entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}