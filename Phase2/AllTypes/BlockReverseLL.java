package Phase2.AllTypes;

import java.util.ArrayList;

import Phase2.LinkedList.Node;

public class BlockReverseLL {

    public static Node reverseLinkedList(Node head, int k) {
        Node prev = null, curr = head, next = null;
        while (curr != null && k > 0) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            k--;
        }
        return prev;
    }

    public static Node getListAfterReverseOperation(Node head, int n, int b[]) {
        Node curr = head, front = head;
        boolean llComplete = false;
        ArrayList<Node> finalHeads = new ArrayList<>();
        for (int blockLength : b) {
            if (blockLength == 0)
                continue;
            for (int i = 0; i < blockLength; i++) {
                if (front == null) {
                    llComplete = true;
                    break;
                }
                front = front.next;
            }
            Node rev = reverseLinkedList(curr, blockLength);
            finalHeads.add(rev);
            curr = front;
        }
        if (!llComplete) {
            finalHeads.add(curr);
        }
        Node newHead = new Node(-1);
        Node base = newHead;
        for (Node node : finalHeads) {
            newHead.next = node;
            while (newHead.next != null) {
                newHead = newHead.next;
            }
        }
        return base.next;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int[] blocks = new int[] { 7 };
        Node sol = getListAfterReverseOperation(head, 0, blocks);
        while (sol != null) {
            System.out.print(sol.data + " ");
            sol = sol.next;
        }
    }
}
