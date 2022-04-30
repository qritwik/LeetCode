class Solution {
    public String countAndSay(int n) {
        
        String s = "1";
        int c = 1;
        while(c < n){
            s = func(s);
            c++;
        }
        return s;
    }
    
    public static String func(String s){
        String out = "";
        int prev_idx = 0;
        char prev = s.charAt(0);
        int i;
        for(i = 1; i < s.length(); i++){
            if(s.charAt(i) != prev) {
                int count = i - prev_idx;
                out = out +  ""+ count + ""+ s.charAt(i-1);
                prev_idx = i;
            }
            prev = s.charAt(i);
        }
        int count = i - prev_idx;
        out = out +  ""+ count + ""+ s.charAt(i-1);
        return out;
    }
}