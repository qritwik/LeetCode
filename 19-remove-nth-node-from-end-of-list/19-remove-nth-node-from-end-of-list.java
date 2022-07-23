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
    public ListNode removeNthFromEnd(ListNode head, int k) {
        int n = getLength(head);
        if(k == n) return head.next;
        int i = 0;
        ListNode temp = head;
        while(i < n-k-1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }
    
    public int getLength(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
}