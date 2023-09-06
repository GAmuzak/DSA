package Phase2.BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftView {
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) {
        ArrayList<Integer> sol = new ArrayList<>();
        if (root == null)
            return sol;
        Queue<TreeNode<Integer>> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        sol.add(root.data);
        while (!nodeQueue.isEmpty()) {
            ArrayList<TreeNode<Integer>> level = new ArrayList<>();
            int size = nodeQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode<Integer> currNode = nodeQueue.poll();
                if (currNode.left != null) {
                    level.add(currNode.left);
                }
                if (currNode.right != null) {
                    level.add(currNode.right);
                }
            }
            if (!level.isEmpty())
                sol.add(level.get(0).data);
            nodeQueue.addAll(level);
        }
        return sol;
    }
}