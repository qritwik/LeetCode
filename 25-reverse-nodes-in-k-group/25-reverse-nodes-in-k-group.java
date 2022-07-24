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

    public ListNode reverseKGroup(ListNode head, int k) {
        int n = getLength(head);
        if (n < k) {
            return head;
        } else if (n == k) {
            Node out = reverse(head);
            return out.head;
        } else {
            int i = 0;
            ListNode temp = head;

            while (i < k - 1) {
                temp = temp.next;
                i++;
            }

            ListNode nextNode = temp.next;
            temp.next = null;

            Node out = reverse(head);
            ListNode smallAns = reverseKGroup(nextNode, k);
            out.tail.next = smallAns;
            return out.head;
        }
    }

    public int getLength(ListNode temp) {
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public Node reverse(ListNode temp) {
        ListNode d = null;
        ListNode tail = null;
        while (temp != null) {
            ListNode cur = temp.next;
            temp.next = d;
            if (d == null) tail = temp;
            d = temp;
            temp = cur;
        }
        Node node = new Node();
        node.head = d;
        node.tail = tail;
        return node;
    }
}

class Node {
    ListNode head;
    ListNode tail;
}
