class Solution {
    public boolean isHappy(int n) {
    
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        
        while(n != 1){
            
            n = cal(n);
            if(set.contains(n)) {
                return false;
            }
            set.add(n);
        }
        
        return true;
        
    }
    
    public int cal(int num){
        int sum = 0;
        while(num > 0){
            int d = num % 10;
            sum = sum + d*d;
            num = num / 10;
        }
        return sum;
    }
    
}