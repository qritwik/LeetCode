class Solution {
    public int maxVowels(String s, int k) {
        int i = 0;
        int j = 0;
        int vowel_count = 0;
        int max = Integer.MIN_VALUE;
        while(j < s.length()) {
            if(checkVowel(s.charAt(j))) vowel_count++;
            if(j-i+1 < k) {
                j++;
            }
            else if(j-i+1 == k) {
                max = Math.max(max, vowel_count);
                if(checkVowel(s.charAt(i))) vowel_count--;
                i++;
                j++;
            }
        }
        return max;
    }
    
    public boolean checkVowel(char c) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        else {
            return false;
        }
    }
}

/*
k = 3
i = 0
j = 2
vc = 2
max = -1
n = 9



*/