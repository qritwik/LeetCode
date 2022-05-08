class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i <= (s.length() - p.length()); i++) {
            String str = s.substring(i, i+p.length());
            if(checkAnagram(str, p)) {
                result.add(i);
            }
        }
        return result;
    }
    
    public boolean checkAnagram(String s, String p) {
        int[] bucket = new int[26];
        for(char ch1 : s.toCharArray()) {
            bucket[ch1 - 'a']++;
        }
        for(char ch2 : p.toCharArray()) {
            bucket[ch2 - 'a']--;
        }
        for(int value : bucket) {
            if(value != 0) {
                return false;
            }
        }
        return true;
    }
}