/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode tempA = headA;
        int lenA = 0;
        while(tempA != null){
            tempA = tempA.next;
            lenA++;
        }
        
        ListNode tempB = headB;
        int lenB = 0;
        while(tempB != null){
            tempB = tempB.next;
            lenB++;
        }
                
        ListNode newHeadA = headA;
        ListNode newHeadB = headB;
        if(lenA > lenB){
            int k = lenA - lenB;
            int i = 0;
            while(i < k){
                newHeadA = newHeadA.next;
                i++;
            } 
        }
        else{
            int k = lenB - lenA;
            int i = 0;
            while(i < k){
                newHeadB = newHeadB.next;
                i++;
            }
        }
        
        while(newHeadA != null && newHeadB != null){
            if(newHeadA == newHeadB){
                return newHeadA;
            }
            newHeadA = newHeadA.next;
            newHeadB = newHeadB.next;
        }
        return null;
    }
}