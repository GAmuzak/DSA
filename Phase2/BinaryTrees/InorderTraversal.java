package Phase2.BinaryTrees;

import java.util.*;

public class InorderTraversal {
    public static List<Integer> getInOrderTraversal(TNode root) {
        List<Integer> sol = new ArrayList<>();
        addToInorder(root, sol);
        return sol;
    }

    private static void addToInorder(TNode node, List<Integer> sol) {
        if (node == null)
            return;
        addToInorder(node.left, sol);
        sol.add(node.data);
        addToInorder(node.right, sol);
    }
}
