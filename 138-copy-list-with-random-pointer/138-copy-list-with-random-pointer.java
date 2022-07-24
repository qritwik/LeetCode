/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        
        Node temp1 = head;
        while(temp1 != null) {
            Node node = new Node(temp1.val);
            map.put(temp1, node);
            temp1 = temp1.next;
        }
        
        Node temp2 = head;
        while(temp2 != null) {
            map.get(temp2).next = map.get(temp2.next);
            map.get(temp2).random = map.get(temp2.random);
            temp2 = temp2.next;
        }
        
        return map.get(head);
    }
}