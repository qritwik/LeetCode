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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode last = head;
        int k = 1;
        while (k < left - 1) {
            last = last.next;
            k++;
        }
        if (left == 1) {
            last = null;
        }

        ListNode temp = head;
        int t = 1;
        while (t < right) {
            temp = temp.next;
            t++;
        }

        ListNode first = temp.next;
        temp.next = null;

        ListNode d = first;

        ListNode temp1 = null;
        if (last != null) {
            temp1 = last.next;
        } else {
            temp1 = head;
        }

        while (temp1 != null) {
            ListNode cur = temp1.next;
            temp1.next = d;
            d = temp1;
            temp1 = cur;
        }

        if (last != null) {
            last.next = d;
            return head;
        } else {
            return d;
        }
    }
}
