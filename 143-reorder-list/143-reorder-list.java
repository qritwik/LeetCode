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
        
        ListNode temp1 = head;
        ListNode temp2 = reverse(findMid(head).next);
        ListNode d = null;
        
        if(temp2 == null) {
            return;
        }
        while(temp1 != null && temp2 != null) {
            if(d == null) {
                ListNode cur = temp1.next;
                temp1.next = temp2;
                d = temp2;
                temp1 = cur;
                temp2 = temp2.next; 
            }
            else {
                d.next = temp1;
                ListNode cur = temp1.next;
                temp1.next = temp2;
                d = temp2;
                temp1 = cur;
                temp2 = temp2.next; 
            }
        }
        
        if(temp1 != null) {
            d.next = temp1;
            temp1.next = null;
        }
    }
    
    public ListNode reverse(ListNode temp) {
        ListNode d = null;
        while(temp != null) {
            ListNode cur = temp.next;
            temp.next = d;
            d = temp;
            temp = cur;
        }
        return d;
    }
    
    public ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}