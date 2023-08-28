package Phase2.StacksAndQueues;

import java.util.Queue;

public class ReverseQueue {
    public static Queue<Integer> reverseQueue(Queue<Integer> q) {
        int[] arr = new int[q.size()];
        int idx = 0;
        while (!q.isEmpty()) {
            int curr = q.poll();
            arr[idx] = curr;
            idx++;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            q.add(arr[i]);
        }
        return q;
    }
}
