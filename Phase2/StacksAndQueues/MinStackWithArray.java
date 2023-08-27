package Phase2.StacksAndQueues;

import java.util.Stack;

public class MinStackWithArray {
    static class MinStack {
        Stack<Integer> main;
        Stack<Integer> min;

        MinStack() {
            main = new Stack<>();
            min = new Stack<>();
        }

        void push(int num) {
            main.push(num);
            if (min.empty() || min.peek() > num) {
                min.push(num);
            } else {
                min.push(min.peek());
            }
        }

        int pop() {
            if (main.empty())
                return -1;
            min.pop();
            return main.pop();
        }

        int top() {
            if (main.empty())
                return -1;
            return main.peek();
        }

        int getMin() {
            if (min.empty())
                return -1;
            return min.peek();
        }
    }
}