class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> output = new ArrayList<>();
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0; i < groupSizes.length; i++) {
            if(!map.containsKey(groupSizes[i])) {
                List<Integer> valueList = new ArrayList<>();
                valueList.add(i);
                map.put(groupSizes[i], valueList);
            }
            else {
                List<Integer> valueList = map.get(groupSizes[i]);
                if(valueList.size() < groupSizes[i]) {
                    valueList.add(i);
                    map.put(groupSizes[i], valueList);
                }
                else if(valueList.size() == groupSizes[i]) {
                    output.add(valueList);
                    List<Integer> newValueList = new ArrayList<>();
                    newValueList.add(i);
                    map.put(groupSizes[i], newValueList);
                }
            }
        }
        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()) {
            output.add(entry.getValue());
        }
        return output;
    }
}