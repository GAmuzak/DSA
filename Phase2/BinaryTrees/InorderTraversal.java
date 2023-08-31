package Phase2.BinaryTrees;

import java.util.*;

public class InorderTraversal {
    public static List<Integer> getInOrderTraversal(TreeNode root) {
        List<Integer> sol = new ArrayList<>();
        addToInorder(root, sol);
        return sol;
    }

    private static void addToInorder(TreeNode node, List<Integer> sol) {
        if (node == null)
            return;
        addToInorder(node.left, sol);
        sol.add(node.data);
        addToInorder(node.right, sol);
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    TreeNode(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.data = val;
        this.left = left;
        this.right = right;
    }
};
