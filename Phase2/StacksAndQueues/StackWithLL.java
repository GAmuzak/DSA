package Phase2.StacksAndQueues;

public class StackWithLL {
    static class Stack {
        int size;
        Node head;

        Stack() {
            head = null;
            size = 0;
        }

        int getSize() {
            return size;
        }

        boolean isEmpty() {
            return size == 0;
        }

        void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            size++;
        }

        void pop() {
            if (head == null)
                return;
            head = head.next;
        }

        int getTop() {
            if (head == null)
                return -1;
            return head.data;
        }
    }
}

class Node {
    int data;
    Node next;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
};