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

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp1 = head;
        ListNode temp3 = slow.next;

        ListNode temp2 = reverseList(temp3);

        while (temp2 != null) {
            if (temp1.val != temp2.val) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode d = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode cur = temp.next;
            temp.next = d;
            d = temp;
            temp = cur;
        }
        return d;
    }
}
