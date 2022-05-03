class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        
        int i = 0;
        int j = 0;
        int n = pattern.length();
        int m = arr.length;
        if(n != m){
            return false;
        }
        
        while(i < n && j < m) {
            
            char c1 = pattern.charAt(i);
            String s2 = arr[j];
            if(map.containsKey(c1)) {
                String s1 = map.get(c1);
                if(!s1.equals(s2)) {
                    return false;
                } 
            }
            else{
                if(set.contains(s2)) {
                    return false;
                }
                map.put(c1, s2);
                set.add(s2);
            }
            i++;
            j++;
            
        }
        return true;
    }
}