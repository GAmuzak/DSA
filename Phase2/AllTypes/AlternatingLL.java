package Phase2.AllTypes;

import java.util.Stack;

import Phase2.StacksAndQueues.Node;

class MidNodeData {
    Node midNode;
    boolean isOdd;

    public MidNodeData(Node midNode, boolean isOdd) {
        this.midNode = midNode;
        this.isOdd = isOdd;
    }
}

public class AlternatingLL {

    public static MidNodeData getMidNode(Node root) {
        Node slow = root;
        Node fast = root;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        MidNodeData midNodeData = new MidNodeData(slow, fast == null ? false : true);
        return midNodeData;
    }

    public static Node rearrangeList(Node head) {
        if (head == null ||
                head.next == null ||
                head.next.next == null)
            return head;
        Stack<Node> nodeStack = new Stack<>();
        Node curr = head;
        MidNodeData data = getMidNode(head);
        Node midNode = data.midNode;
        System.out.println(midNode.data);
        while (curr != null) {
            nodeStack.add(curr);
            curr = curr.next;
        }
        curr = head;
        Node sol = new Node(-1);
        Node base = sol;
        while (curr != midNode) {
            Node rightNode = nodeStack.pop();
            sol.next = curr;
            curr = curr.next;
            rightNode.next = null;
            sol.next.next = rightNode;
            sol = sol.next.next;
        }
        if (data.isOdd) {
            sol.next = midNode;
            sol.next.next = null;
        }
        return base.next;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(3);
        root.next.next.next = new Node(4);
        root.next.next.next.next = new Node(5);
        Node sol = rearrangeList(root);
        int i = 1;
        while (sol != null) {
            System.out.print(sol.data + " ");
            sol = sol.next;
            if (i == 10)
                break;
            i++;
        }
    }
}
