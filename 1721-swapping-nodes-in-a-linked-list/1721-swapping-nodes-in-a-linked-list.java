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
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }

        ListNode temp1 = head;
        int i = 0;
        while (i < k - 1) {
            temp1 = temp1.next;
            i++;
        }

        ListNode temp2 = head;
        int j = 0;
        while (j < length - k) {
            temp2 = temp2.next;
            j++;
        }

        int t = temp1.val;
        temp1.val = temp2.val;
        temp2.val = t;

        return head;
    }
}
