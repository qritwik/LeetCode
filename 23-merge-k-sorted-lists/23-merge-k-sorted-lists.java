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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        return mergeKListsHelper(lists, 0);
    }
    
    public ListNode mergeKListsHelper(ListNode[] list, int si) {
        if(si == list.length-1) {
            return list[si];
        }
        ListNode temp2 = mergeKListsHelper(list, si+1);
        ListNode temp1 = list[si];
        ListNode head = mergeTwoLists(temp1, temp2);
        return head;
        
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode d = null;

        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                if (head == null) {
                    head = list1;
                    d = list1;
                } else {
                    d.next = list1;
                    d = list1;
                }
                list1 = list1.next;
            } else {
                if (head == null) {
                    head = list2;
                    d = list2;
                } else {
                    d.next = list2;
                    d = list2;
                }
                list2 = list2.next;
            }
        }

        if (list1 == null) {
            d.next = list2;
        }

        if (list2 == null) {
            d.next = list1;
        }

        return head;
    }
}