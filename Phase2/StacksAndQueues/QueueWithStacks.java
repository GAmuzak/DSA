package Phase2.StacksAndQueues;

import java.util.*;

public class QueueWithStacks {
    Stack<Integer> stk1, stk2;

    public QueueWithStacks() {
        stk1 = new Stack<>();
        stk2 = new Stack<>();
    }

    public boolean enqueue(int x) {
        while (!stk1.empty()) {
            stk2.push(stk1.pop());
        }
        stk1.push(x);
        while (!stk2.empty()) {
            stk1.push(stk2.pop());
        }
        return true;
    }

    public int dequeue() {
        if (stk1.empty())
            return -1;
        int num = stk1.pop();
        return num;
    }
}
