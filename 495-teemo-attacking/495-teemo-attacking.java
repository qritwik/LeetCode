class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        
        int n = timeSeries.length;
        int count = 0;
        int gap = 0;
        
        for(int i = 0; i < n-1; i++){
            int first = timeSeries[i];
            int second = timeSeries[i+1];
            
            gap = second - first;
            
            if(gap < duration){
                count += gap;
            }
            else{
                count += duration;
            }
        }
        count += duration;
        return count;
    }
}

/*

c = 1

[1,3,5] ,,,,,, d = 3

1 => 1 2 3
3 => 3 4 5
5 => 5 6 7

gap = 2

*/