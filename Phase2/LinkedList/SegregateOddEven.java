package Phase2.LinkedList;

public class SegregateOddEven {
    public static Node segregateOddEven(Node head) {
        if (head == null || head.next == null)
            return head;
        Node base = new Node(0);
        base.next = head;
        Node odd = base, curr = head, prev = base;
        while (curr != null) {
            if (curr.data % 2 == 1 && odd.next != curr) {
                prev.next = curr.next;
                curr.next = odd.next;
                odd.next = curr;
                curr = prev;
                odd = odd.next;
            }
            if (curr.data % 2 == 1 && odd.next == curr) {
                odd = odd.next;
            }
            prev = curr;
            curr = curr.next;
        }
        return base.next;
    }

    public static void main(String[] args) {
        Node inp = new Node(0);
        Node head = inp;
        for (int i = 0; i < 16; i++) {
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
        Node sol = segregateOddEven(head);
        while (sol != null) {
            System.out.print(sol.data + " ");
            sol = sol.next;
        }
    }
}