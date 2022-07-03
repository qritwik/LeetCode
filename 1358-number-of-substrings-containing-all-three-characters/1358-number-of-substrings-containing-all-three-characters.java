class Solution {

    public int numberOfSubstrings(String s) {
        int count = 0;
        int i = 0;
        int j = 2;
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int k = i; k <= j; k++) {
            insertIntoMap(map, arr[k]);
        }
        while (j < arr.length) {
            if (map.size() == 3) {
                count += (arr.length - j);
                removeFromMap(map, arr[i]);
                i++;
            } else {
                j++;
                if (j < arr.length) {
                    insertIntoMap(map, arr[j]);
                }
            }
        }
        return count;
    }

    public void insertIntoMap(HashMap<Character, Integer> map, Character key) {
        if (!map.containsKey(key)) {
            map.put(key, 1);
        } else {
            map.put(key, map.get(key) + 1);
        }
    }

    public void removeFromMap(HashMap<Character, Integer> map, Character key) {
        if (map.get(key) == 1) {
            map.remove(key);
        } else {
            map.put(key, map.get(key) - 1);
        }
    }
}
