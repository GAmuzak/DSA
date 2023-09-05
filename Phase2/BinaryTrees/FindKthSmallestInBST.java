package Phase2.BinaryTrees;

import java.util.*;
import java.util.List;

public class FindKthSmallestInBST {
    private static void addToInorder(TreeNode node, List<Integer> sol) {
        if (node == null)
            return;
        addToInorder(node.left, sol);
        sol.add(node.data);
        addToInorder(node.right, sol);
    }

    public static List<Integer> getInOrderTraversal(TreeNode root) {
        List<Integer> sol = new ArrayList<>();
        addToInorder(root, sol);
        return sol;
    }

    public static int kthSmallest(TreeNode root, int k) {
        List<Integer> sorted = getInOrderTraversal(root);
        return sorted.get(k + 1);
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

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
};
