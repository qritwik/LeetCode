/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        HashMap<ListNode,Integer> map = new HashMap<>();
        int i = 0;
        ListNode temp = head;
        while(temp != null){
            
            if(!map.containsKey(temp)){
                map.put(temp, i);
            }
            else{
                return temp;
            }
            temp = temp.next;
            i++;
        }
        return null;
    }
}