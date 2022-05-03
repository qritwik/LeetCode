class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue(Map.Entry.comparingByValue().reversed());
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.add(entry);
        }
        
        String out = "";
        while(!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.remove();
            out += String.valueOf(entry.getKey()).repeat(entry.getValue());
        }
        return out;
    }
}