class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> result = new ArrayList<>();
        if(s.length() == 0) {
            List<String> list = new ArrayList<>();
            result.add(list);
            return result;
        }
        if(s.length() == 1) {
            List<String> list = new ArrayList<>();
            list.add(s);
            result.add(list);
            return result;
        }
        
        for(int i = 0; i < s.length(); i++) {
            String prefix = s.substring(0, i+1);
            if(isPalindrome(prefix)) {
                List<List<String>> smallAns = partition(s.substring(i+1));
                for(List<String> list : smallAns) {
                    List<String> newList = new ArrayList<>(list);
                    newList.add(0, prefix);
                    result.add(newList);
                }
            }
        }
        return result;
    }
    
    public boolean isPalindrome(String s) {
        int li = 0;
        int ri = s.length() - 1;
        while(li < ri) {
            if(s.charAt(li) != s.charAt(ri)) {
                return false;
            }
            li++;
            ri--;
        }
        return true;
    }
}