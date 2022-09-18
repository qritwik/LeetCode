class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = cal(n);
        
        while(fast != 1) {
            slow = cal(slow);
            fast = cal(cal(fast));
            if(slow == fast) {
                return false;
            }
        }
        return true;
    }
    
    public int cal(int num) {
        int sum = 0;
        while(num > 0) {
            int d = num % 10;
            sum += d * d;
            num = num / 10;
        }
        return sum;
    }
}
