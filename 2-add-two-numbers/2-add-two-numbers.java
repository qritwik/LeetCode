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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode d = null;
        int carry = 0;
        int sum = 0;
        while(l1 != null || l2 != null) {
            sum = carry;
            if(l1 != null) {
                sum += l1.val;
            }
            if(l2 != null) {
                sum += l2.val;
            }
            carry = sum / 10;
            sum = sum % 10;
            ListNode node = new ListNode(sum);
            if(head == null) {
                head = node;
                d = node;
            }
            else {
                d.next = node;
                d = node;
            }
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            
        }
        if(carry != 0) {
            ListNode node = new ListNode(carry);
            d.next = node;
        }
        return head;
    }
}