/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
    
        List<Integer> list = new ArrayList<Integer>();
        
        ListNode temp = head;
        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        
        int start = 0;
        int end = list.size() - 1;
        ListNode prev = null;
        
        while(start < end){
            
            int a = list.get(start);
            int b = list.get(end);
            
            ListNode low = new ListNode(a);
            ListNode high = new ListNode(b);
            
            if(start == 0){
                head.next = high;
            }
            else{
                low.next = high;
            }
            
            if(prev != null) {
                prev.next = low;
            }
            prev = high;
            
            start++;
            end--;
            
        }
        
        if(list.size() % 2 != 0){
            ListNode last = new ListNode(list.get(start));
            if(prev != null) {
                prev.next = last;
            }
        }
                
    }
}