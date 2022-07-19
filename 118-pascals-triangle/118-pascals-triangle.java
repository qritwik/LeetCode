class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        res.add(1);
        result.add(res);
        for(int i = 1; i < numRows; i++) {
            List<Integer> res1 = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                int out = getValue(result.get(i-1), j-1) + getValue(result.get(i-1), j);
                res1.add(out);
            }
            result.add(res1);
        }
        return result;
    }
    
    public int getValue(List<Integer> list, int idx) {
        if(idx >= 0 && idx < list.size()) {
            return list.get(idx);
        }
        return 0;
    }
    
}