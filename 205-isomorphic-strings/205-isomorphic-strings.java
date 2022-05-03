class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int n = s.length();
        int m = t.length();
        
        if(n != m) {
            return false;
        }
        
        while(i < n && j < m) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(j);
            if(map.containsKey(c1)) {
                char val1 = map.get(c1);
                if(val1 != c2) {
                    return false;
                }
            }
            else{
                if(set.contains(c2)){
                    return false;
                }
                map.put(c1, c2);
                set.add(c2);
            }
            i++;
            j++;
        }
        return true;
    }
}