package Phase2.BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static ArrayList<Integer> getLevelOrder(BinTreeNode root) {
        ArrayList<Integer> sol = new ArrayList<>();
        if (root == null)
            return sol;
        Queue<BinTreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            int size = nodeQueue.size();
            ArrayList<BinTreeNode> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                BinTreeNode currNode = nodeQueue.poll();
                if (currNode.left != null)
                    level.add(currNode.left);
                if (currNode.right != null)
                    level.add(currNode.right);
                sol.add(currNode.data);
            }
            nodeQueue.addAll(level);
        }
        return sol;
    }
}