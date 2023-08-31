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
            int size = nodeQueue.size();
            ArrayList<BinaryTreeNode> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                BinaryTreeNode currNode = nodeQueue.poll();
                if (currNode.left != null)
                    level.add(currNode.left);
                if (currNode.right != null)
                    level.add(currNode.right);
                sol.add(currNode.val);
            }
            nodeQueue.addAll(level);
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