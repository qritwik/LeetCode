import java.util.Arrays;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            char strArr[] = strs[i].toCharArray();
            Arrays.sort(strArr);
            String sortedStr = new String(strArr);
            if(!map.containsKey(sortedStr)) {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sortedStr, list);
            }
            else {
                List<String> list = map.get(sortedStr);
                list.add(strs[i]);
                map.put(sortedStr, list);
            }
        }
        
        List<List<String>> result = new ArrayList<>();
        for(String key : map.keySet()) {
            result.add(map.get(key));
        }
        return result;
    }
}