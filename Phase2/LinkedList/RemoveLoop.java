package Phase2.LinkedList;

public class RemoveLoop {
    public static Node removeLoop(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return head;
        }
        Node fromStart = head;
        while (fromStart != slow) {
            fromStart = fromStart.next;
            slow = slow.next;
        }
        Node prev = slow;
        while (prev.next != slow) {
            prev = prev.next;
        }
        prev.next = null;
        return head;
    }
}