class Solution {
    List<List<String>> result = new ArrayList<>();

    public List<List<String>> partition(String s) {
        List<String> asf = new ArrayList<>();
        partitionHelper(s, asf);
        return result;
    }

    public void partitionHelper(String s, List<String> asf) {
        if (s.length() == 0) {
            result.add(new ArrayList<>(asf));
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String prefix = s.substring(0, i + 1);
            if (isPalindrome(prefix)) {
                asf.add(prefix);
                partitionHelper(s.substring(i + 1), asf);
                asf.remove(asf.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s) {
        int li = 0;
        int ri = s.length() - 1;
        while (li < ri) {
            if (s.charAt(li) != s.charAt(ri)) {
                return false;
            }
            li++;
            ri--;
        }
        return true;
    }
}
