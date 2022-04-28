class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> res = new ArrayList<>();
        if(nums.length == 0){
            return res;
        }
        int idx = nums[0];
        int prev = nums[0];
        
        int i = 0;
        for(i = 1; i < nums.length; i++){
            
            if(nums[i] != prev + 1){
                
                String str = "";
                if(idx != nums[i-1]){
                    str = idx + "->" + nums[i-1];
                    res.add(str);    
                }
                else{
                    str = idx + "";
                    res.add(str);
                }
                idx = nums[i];
            }
            prev = nums[i];
        }
        
        String str = "";
        if(nums[i-1] != idx){
            str = idx + "->" + nums[i - 1];
            res.add(str);
        }
        else{
            str = idx + "";
            res.add(str);
        }
        
        return res;
        
    }
}