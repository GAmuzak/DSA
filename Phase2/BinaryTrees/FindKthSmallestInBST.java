package Phase2.BinaryTrees;

import java.util.*;
import java.util.List;

public class FindKthSmallestInBST {
    private static void addToInorder(TNode node, List<Integer> sol) {
        if (node == null)
            return;
        addToInorder(node.left, sol);
        sol.add(node.data);
        addToInorder(node.right, sol);
    }

    public static List<Integer> getInOrderTraversal(TNode root) {
        List<Integer> sol = new ArrayList<>();
        addToInorder(root, sol);
        return sol;
    }

    public static int kthSmallest(TNode root, int k) {
        List<Integer> sorted = getInOrderTraversal(root);
        return sorted.get(k + 1);
    }
}


