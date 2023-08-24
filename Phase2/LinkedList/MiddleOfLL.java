package Phase2.LinkedList;

public class MiddleOfLL {
    public static Node findMiddle(Node head) {
        Node curr = head, middle = head;
        int length = 1;
        while (curr != null) {
            curr = curr.next;
            length++;
            if (length % 2 == 0) {
                middle = middle.next;
            }
        }
        return middle;
    }
}
