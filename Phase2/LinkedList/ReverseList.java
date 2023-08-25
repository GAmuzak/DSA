package Phase2.LinkedList;

public class ReverseList {
    public static LinkedListNode reverseLinkedList(LinkedListNode head) {
        LinkedListNode prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

class LinkedListNode {
    int data;
    LinkedListNode next;
    public LinkedListNode(int data) {
        this.data = data;
    }
}
