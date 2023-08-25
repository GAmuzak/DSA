package Phase2.LinkedList;

public class DeleteKthNode {
    public static Node removeKthNode(Node head, int K) {
        Node fast = head, slow = head, prev = slow;
        while (K > 0) {
            fast = fast.next;
            K--;
        }
        while (fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if (slow.equals(head)) {
            return head.next;
        } else {
            prev.next = slow.next;
            return head;
        }
    }

    public static void main(String[] args) {
        Node inp = new Node(0);
        Node head = inp;
        for (int i = 0; i < 3; i++) {
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
        Node sol = removeKthNode(head, 3);
        while (sol != null) {
            System.out.print(sol.data + " ");
            sol = sol.next;
        }
    }
}

class Node {
    public int data;
    public Node next;
    public Node prev;

    Node() {
        this.data = 0;
        this.next = null;
        this.prev = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
        this.prev = next;
    }
};