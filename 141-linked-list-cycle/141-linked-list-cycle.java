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
    public boolean hasCycle(ListNode head) {
        
        HashSet<ListNode> map = new HashSet<>();
        ListNode temp = head;
        
        while(temp != null){
            if(!map.contains(temp)){
                map.add(temp);
            }
            else{
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}