package Phase2.StacksAndQueues;

public class QueueWithArray {
    class SQueue {

        int size;
        Node head;
        Node tail;

        SQueue() {
            size = 0;
            head = null;
            tail = head;
        }

        boolean isEmpty() {
            return size == 0;
        }

        void enqueue(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = head;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
            size++;
        }

        int dequeue() {
            if (head == null)
                return -1;
            int num = head.data;
            head = head.next;
            size--;
            return num;
        }

        int front() {
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
}