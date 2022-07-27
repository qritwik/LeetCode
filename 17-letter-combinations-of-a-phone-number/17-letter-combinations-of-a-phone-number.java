class Solution {

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            List<String> result = new ArrayList<>();
            return result;
        }
        return letterCombinationsHelper(digits, 0);
    }

    public List<String> letterCombinationsHelper(String digits, int si) {
        List<String> result = new ArrayList<>();
        if (si == digits.length()) {
            result.add("");
            return result;
        }

        List<String> smallOut = letterCombinationsHelper(digits, si + 1);
        for (String str : smallOut) {
            char[] arr = getCharArray(digits.charAt(si));
            for (char c : arr) {
                String newStr = c + "" + str;
                result.add(newStr);
            }
        }
        return result;
    }

    public char[] getCharArray(char c) {
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        String res = map.get(c);
        return res.toCharArray();
    }
}
