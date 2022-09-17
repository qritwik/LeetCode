class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            Pair p = getCountofFactors(num);
            System.out.println(p.count);
            System.out.println(p.sum);
            System.out.println("-------");
            if (p.count == 4) {
                sum += p.sum;
            }
        }
        return sum;
    }

    public Pair getCountofFactors(int n) {
        Pair p = new Pair();
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                if(n/i == i) {
                    Pair p1 = new Pair();
                    p1.sum += i;
                    p1.count++;
                    return p1;
                }
                else {
                    p.sum += i + n/i;
                    p.count = p.count + 2;
                }
            }
        }
        p.sum = p.sum + n;
        return p;
    }
}

class Pair {
    int count;
    int sum;

    public Pair() {
        this.count = 2;
        this.sum = 1;
    }
}
