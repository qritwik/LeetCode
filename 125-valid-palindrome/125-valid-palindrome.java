class Solution {
    public boolean isPalindrome(String s) {
        char arr[] = s.toCharArray();
        String str = "";
        String rev = "";
        for(char ch : arr) {
            if(Character.isLetterOrDigit(ch)) {
                char ch1 = Character.toLowerCase(ch);
                str = str + ch1;
                rev = ch1 + rev;
            }
        }
        if(str.equals(rev)) {
            return true;
        }
        else{
            return false;
        }
    }
}