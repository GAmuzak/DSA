package Phase2.LinkedList;

public class AppendNodes {
    public static Node<Integer> addNodes(Node<Integer> head, int n, int m) {
        int sum = 0;
        Node<Integer> base = new Node<>(0);
        base.next = head;
        Node<Integer> curr = head, prev = base;
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
            Node<Integer> newNode = new Node<>(sum);
            if (prev.next != null) {
                newNode.next = prev.next;
                prev.next = newNode;
            } else {
                break outer;
            }
            sum = 0;
        }
        if (sum != 0) {
            Node<Integer> finalNode = new Node<>(sum);
            prev.next = finalNode;
        }
        return base.next;
    }

    public static void main(String[] args) {
        Node<Integer> inp = new Node<Integer>(0);
        Node<Integer> head = inp;
        for (int i = 0; i < 14; i++) {
            int rand = (int) ((Math.random() * (99 - 1)) + 1);
            inp.next = new Node<Integer>(rand);
            inp = inp.next;
            inp.data = rand;
        }
        head = head.next;
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        Node<Integer> sol = addNodes(head, 2, 3);
        while (sol != null) {
            System.out.print(sol.data + " ");
            sol = sol.next;
        }
    }
}

class Node<Integer> {
    int data;
    Node<Integer> next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
