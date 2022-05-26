class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(char ch : s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch,0) + 1);
        }
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0; i < Math.min(s1.length(),s2.length()); i++) {
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i),0) + 1);
        }
        if(map1.equals(map2)) return true;
        
        for(int i = s1.length(); i < s2.length(); i++) {
            char charToRemove = s2.charAt(i - s1.length());
            if(map2.get(charToRemove) > 1) {
                map2.put(charToRemove, map2.get(charToRemove) - 1);
            }
            else {
                map2.remove(charToRemove);
            }
            char charToInsert = s2.charAt(i);
            map2.put(charToInsert, map2.getOrDefault(charToInsert, 0) + 1);
            if(map1.equals(map2)) return true;
        }
        return false;
    }
}