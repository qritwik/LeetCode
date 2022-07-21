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

    public int pairSum(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int k = 0;
        int max = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        ListNode temp1 = head;
        while (temp1 != null) {
            if (k < length / 2) {
                stack.push(temp1.val);
            } else {
                max = Math.max(max, stack.pop() + temp1.val);
            }
            k++;
            temp1 = temp1.next;
        }
        return max;
    }
}
