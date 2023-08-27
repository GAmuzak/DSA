package Phase2.StacksAndQueues;

public class StackWithArray {
    public static void main(String[] args) {
        CStack s = new CStack(10);
        s.push(5);
        s.push(5);
        s.push(5);
        s.push(5);
        s.push(5);
        s.push(12);
        s.push(12);
        s.push(12);
        s.push(12);
        System.out.println(s.isFull());
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.isFull());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    }
}

class CStack {
    int capacity = 0;
    int currentIdx = -1;
    int[] arr;

    CStack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public void push(int num) {
        if (isFull() > 0)
            return;
        currentIdx++;
        arr[currentIdx] = num;
    }

    public int pop() {
        if (isEmpty() > 0)
            return -1;
        int num = arr[currentIdx];
        currentIdx--;
        return num;
    }

    public int top() {
        if (isEmpty() > 0) {
            return -1;
        }
        return arr[currentIdx];
    }

    public int isEmpty() {
        if (currentIdx < 0)
            return 1;
        return 0;
    }

    public int isFull() {
        if (currentIdx + 1 == capacity)
            return 1;
        return 0;
    }
}