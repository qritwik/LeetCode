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

    public ListNode swapNodes(ListNode head, int k) {
        ListNode ptr1 = head;
        int i = 0;
        while (i < k - 1) {
            ptr1 = ptr1.next;
            i++;
        }

        ListNode temp = ptr1;
        ptr1 = ptr1.next;
        ListNode ptr2 = head;

        while (ptr1 != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        int t = temp.val;
        temp.val = ptr2.val;
        ptr2.val = t;

        return head;
    }
}
