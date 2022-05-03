class Solution {
    public String removeDigit(String number, char digit) {
        String max = "0";
        for(int i = 0; i < number.length(); i++) {
            char curDigit = number.charAt(i);
            if(curDigit == digit) {
                String newDigit = number.substring(0,i) + number.substring(i+1,number.length());
                if(newDigit.compareTo(max) > 0) {
                    max = newDigit;
                }
            }
        }
        return max;
    }
}