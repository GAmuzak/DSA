package Phase2.BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
        ArrayList<Integer> sol = new ArrayList<>();
        if (root == null)
            return sol;
        Queue<BinaryTreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            BinaryTreeNode currNode = nodeQueue.peek();
            sol.add(nodeQueue.poll().val);
            if (currNode.left != null) {
                nodeQueue.add(currNode.left);
            }
            if (currNode.right != null) {
                nodeQueue.add(currNode.right);
            }
        }
        return sol;
    }
}

class BinaryTreeNode {
    int val;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}