class Solution {
    static HashMap<Character,Integer>hm;
    public static int maxLenStrWithIuniqueChars(String s,int k,int unique){
        int ans,i,j,cnt,len=s.length();
        ans=i=j=cnt=0;
        hm=new HashMap<>();
        char c;
        while(j<len){
            c=s.charAt(j);
            hm.put(c,hm.getOrDefault(c,0)+1);
            if(hm.get(c)==k){
                cnt++;
            }
            if(hm.size()==cnt){
                ans=Math.max(ans,j-i+1);
            }
            while(hm.size()>unique){
                c=s.charAt(i);
                if(hm.get(c)==k){
                    cnt--;
                }
                hm.put(c,hm.get(c)-1);
                if(hm.get(c)==0){
                    hm.remove(c);
                }
                i++;
            }
            j++;
        }
        return ans;
    }
    public int longestSubstring(String s, int k) {
        int res=0;
        for(int i=1;i<=26;i++){
            res=Math.max(res,maxLenStrWithIuniqueChars(s,k,i));
        }
        return res;
    }
}
