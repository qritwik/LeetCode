class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);
            map.put(r, map.getOrDefault(r, 0) + 1);
        }
                
        for(int j = 0; j < magazine.length(); j++) {
            char m = magazine.charAt(j);
            if(map.containsKey(m) && map.get(m) > 0) {
                map.put(m, map.get(m) - 1);
            }
        }
                
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() != 0){
                return false;
            }
        }
        return true;
    }
}