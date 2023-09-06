package Phase2.LinkedList;

public class SwapNodes {
    public static Node pairsSwap(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node base = new Node(0);
        base.next = head;
        Node prev = base;
        while (prev.next != null && prev.next.next != null) {
            Node current = prev.next;
            Node nextNode = current.next;
            current.next = nextNode.next;
            nextNode.next = current;
            prev.next = nextNode;

            prev = current;
        }
        return base.next;
    }
}
