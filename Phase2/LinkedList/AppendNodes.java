package Phase2.LinkedList;

public class AppendNodes {
    public static Node addNodes(Node head, int n, int m) {
        int sum = 0;
        Node base = new Node(0);
        base.next = head;
        Node curr = head, prev = base;
        outer: while (curr != null) {
            for (int i = 0; i < m; i++) {
                if (curr == null)
                    break outer;
                prev = curr;
                curr = curr.next;
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                if (curr == null)
                    break outer;
                sum += curr.data;
                prev = curr;
                curr = curr.next;
            }
            System.out.println();
            Node newNode = new Node(sum);
            if (prev.next != null) {
                newNode.next = prev.next;
                prev.next = newNode;
            } else {
                break outer;
            }
            sum = 0;
        }
        if (sum != 0) {
            Node finalNode = new Node(sum);
            prev.next = finalNode;
        }
        return base.next;
    }

    public static void main(String[] args) {
        Node inp = new Node(0);
        Node head = inp;
        for (int i = 0; i < 14; i++) {
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
        Node sol = addNodes(head, 2, 3);
        while (sol != null) {
            System.out.print(sol.data + " ");
            sol = sol.next;
        }
    }
}
