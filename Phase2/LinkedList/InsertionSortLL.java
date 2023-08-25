package Phase2.LinkedList;

public class InsertionSortLL {

    public static Node insertionSortLL(Node head) {
        Node base = new Node(0);
        base.next = head;
        Node prev = head, curr = head.next;
        while (curr != null) {
            if (prev.data <= curr.data) {
                prev = curr;
                curr = curr.next;
                continue;
            }
            Node tmp = base;
            while (tmp.next.data <= curr.data) {
                tmp = tmp.next;
            }
            prev.next = curr.next;
            curr.next = tmp.next;
            tmp.next = curr;
            curr = prev.next;
        }
        return base.next;
    }

    public static void main(String[] args) {
        Node inp = new Node(0);
        Node head = inp;
        for (int i = 0; i < 15; i++) {
            int rand = (int) ((Math.random() * (99 - 1)) + 1);
            inp.next = new Node(rand);
            inp = inp.next;
            inp.data = rand;
        }
        head = head.next;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        Node sol = insertionSortLL(head);
        while (sol != null) {
            System.out.print(sol.data + " ");
            sol = sol.next;
        }
    }
}

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

