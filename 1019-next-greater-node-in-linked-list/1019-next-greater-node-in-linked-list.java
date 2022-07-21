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
    public int[] nextLargerNodes(ListNode head) {
        
        int length = 0;
        ListNode ptr = head;
        while(ptr != null) {
            ptr = ptr.next;
            length++;
        }
        
        ListNode temp = head;
        int[] res = new int[length];
        int k = 0;
        while(temp != null) {
            int flag = 0;
            ListNode temp1 = temp;
            while(temp1 != null) {
                if(temp1.val > temp.val) {
                    res[k++] = temp1.val;
                    flag = 1;
                    break;
                }
                temp1 = temp1.next;
            }
            if(flag == 0) {
                res[k++] = 0;
            }
            temp = temp.next;
        }
        return res;
    }
}