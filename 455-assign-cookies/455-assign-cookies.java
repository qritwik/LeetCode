class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        
        int i = 0;
        int j = 0;
        int gn = g.length;
        int sn = s.length;
        int count = 0;
        
        while(i < gn && j < sn){
            if(s[j] >= g[i]){
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        
        return count;
        
    }
}