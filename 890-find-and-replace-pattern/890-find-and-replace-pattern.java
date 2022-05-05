class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for(String word : words) {
            if(checkIfReplacable(word, pattern)) {
                result.add(word);
            }
        }
        return result;
    }
    
    public boolean checkIfReplacable(String word, String pattern) {
        if(word.length() != pattern.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> valueSet = new HashSet<>();
        int i = 0, j = 0;
        while(i < word.length()) {
            char wordChar = word.charAt(i);
            char patternChar = pattern.charAt(j);
            if(!map.containsKey(wordChar)) {
                if(valueSet.contains(patternChar)) {
                    return false;
                }
                map.put(wordChar, patternChar);
                valueSet.add(patternChar);
                
            } else {
                char wordValue = map.get(wordChar);
                if(wordValue != patternChar) {
                    return false;
                }
            }
            i++;
            j++;
        }
        return true;
    }
}