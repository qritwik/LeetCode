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
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        
        int[] res = new int[list.size()];
        
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < list.size(); i++) {
            if(stack.isEmpty()) {
                stack.push(i);
            }
            else if(list.get(i) <= list.get(stack.peek())) {
                stack.push(i);
            }
            else {
                while(!stack.isEmpty() && (list.get(i) > list.get(stack.peek()))) {
                    int idx = stack.pop();
                    res[idx] = list.get(i);
                }
                stack.push(i);
            }
        }
        
        while(!stack.isEmpty()) {
            int idx = stack.pop();
            res[idx] = 0;
        }
        
        return res;
    }
}