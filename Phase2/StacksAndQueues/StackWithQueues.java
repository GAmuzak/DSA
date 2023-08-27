package Phase2.StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class StackWithQueues {
    static class Stack {
        int size;
        Queue<Integer> q1, q2;

        public Stack() {
            size = 0;
            q1 = new LinkedList<Integer>();
            q2 = new LinkedList<Integer>();
        }

        public int getSize() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void push(int element) {
            while (!q1.isEmpty()) {
                q2.add(q1.poll());
            }
            q1.add(element);
            while (!q2.isEmpty()) {
                q1.add(q2.poll());
            }
            size++;
        }

        public int pop() {
            if (q1.isEmpty())
                return -1;
            int num = q1.poll();
            size--;
            return num;
        }

        public int top() {
            if (q1.isEmpty())
                return -1;
            return q1.peek();
        }
    }
}
