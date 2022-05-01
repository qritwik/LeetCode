class Solution {
    public String reverseWords(String s) {
        
        char arr[] = s.toCharArray();
        int space = -1;
        int i;
        for(i = 0; i < arr.length; i++){
            if(arr[i] == ' '){
                reverse(arr, space+1, i-1);
                space = i;
            }
        }
        reverse(arr, space+1, i-1);
        return new String(arr);
    }
    
    public void reverse(char arr[], int i, int j){
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}