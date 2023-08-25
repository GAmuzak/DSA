package Phase2.LinkedList;

public class RemoveLoop {
    public static Node removeLoop(Node head) {
        return head;
    }
}

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}