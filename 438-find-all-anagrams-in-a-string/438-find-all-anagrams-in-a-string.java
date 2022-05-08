class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        HashMap<Character,Integer> pmap = new HashMap<>();
        for(char ch : p.toCharArray()) {
            pmap.put(ch, pmap.getOrDefault(ch, 0) + 1);
        }
        HashMap<Character,Integer> smap = new HashMap<>();
        for(int i = 0; i < Math.min(p.length(),s.length()); i++) {
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
        }
        if(smap.equals(pmap)) {
            result.add(0);
        }
        
        for(int i = p.length(); i < s.length(); i++) {
            char charToRemove = s.charAt(i - p.length());
            if(smap.get(charToRemove) > 1) {
                smap.put(charToRemove, smap.get(charToRemove)-1);
            }
            else {
                smap.remove(charToRemove);
            }
            char charToInsert = s.charAt(i);
            smap.put(charToInsert, smap.getOrDefault(charToInsert, 0) + 1);
            if(smap.equals(pmap)) {
                result.add(i-p.length()+1);
            }
        }
        return result;
    }
}