package Phase2.BinaryTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagOrderTraversal {

    public static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {
        List<Integer> sol = new ArrayList<>();
        if (root == null)
            return sol;
        Queue<BinaryTreeNode<Integer>> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        int turn = 0;
        while (!nodeQueue.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<>();
            int size = nodeQueue.size();
            for (int i = 0; i < size; i++) {
                BinaryTreeNode<Integer> currNode = nodeQueue.poll();
                if (currNode.left != null) {
                    nodeQueue.add(currNode.left);
                }
                if (currNode.right != null) {
                    nodeQueue.add(currNode.right);
                }
                level.add(currNode.data);
            }
            if (turn % 2 == 1)
                Collections.reverse(level);
            sol.addAll(level);
            turn++;
        }
        return sol;
    }
}

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}