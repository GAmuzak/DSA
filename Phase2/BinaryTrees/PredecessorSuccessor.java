package Phase2.BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PredecessorSuccessor {

    public static List<Integer> getInOrderTraversal(TNode root) {
        ArrayList<Integer> sol = new ArrayList<>();
        Stack<TNode> nodeTracker = new Stack<>();
        TNode currNode = root;
        while (!nodeTracker.isEmpty() || currNode != null) {
            while (currNode != null) {
                nodeTracker.add(currNode);
                currNode = currNode.left;
            }
            currNode = nodeTracker.pop();
            sol.add(currNode.data);
            currNode = currNode.right;
        }
        return sol;
    }

    public static int binSearch(List<Integer> sorted, int key) {
        int left = 0;
        int right = sorted.size() - 1;
        while (left <= right) {
            int midIndex = left + (right - left) / 2;
            int midValue = sorted.get(midIndex);
            if (midValue == key) {
                return midIndex;
            }
            if (midValue < key) {
                left = midIndex + 1;
            } else {
                right = midIndex - 1;
            }
        }
        return -1;
    }

    public static List<Integer> predecessorSuccessor(TNode root, int key) {
        List<Integer> sorted = getInOrderTraversal(root);
        List<Integer> ans = new ArrayList<>();
        int prev = 0, next = 0;
        for (int i = 0; i < sorted.size(); i++) {
            if (sorted.get(i) < key) {
                prev = sorted.get(i);
            }
            if (sorted.get(i) > key) {
                next = sorted.get(i);
                break;
            }
        }
        ans.add(prev);
        ans.add(next);
        return ans;
    }
}
