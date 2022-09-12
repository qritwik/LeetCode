class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        out.add(1);
        res.add(out);
        for(int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                int val = getValue(res, i-1, j) + getValue(res, i-1, j-1);
                temp.add(val);
            }
            res.add(temp);
        }
        return res;
    }
    
    public int getValue(List<List<Integer>> res, int i, int j) {
        if(j >= 0 && j < res.get(i).size()) {
            return res.get(i).get(j);
        }
        return 0;
    }
}