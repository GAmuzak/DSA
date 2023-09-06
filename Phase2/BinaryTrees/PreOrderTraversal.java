package Phase2.BinaryTrees;

import java.util.ArrayList;

public class PreOrderTraversal {

    public static void addToPreorder(BinaryTreeNode<Integer> node, ArrayList<Integer> sol) {
        if (node == null)
            return;
        sol.add(node.data);
        addToPreorder(node.left, sol);
        addToPreorder(node.right, sol);
    }

    public static ArrayList<Integer> preorderTraversal(BinaryTreeNode<Integer> root) {
		ArrayList<Integer> sol = new ArrayList<>();
        addToPreorder(root, sol);
        return sol;
	}
}