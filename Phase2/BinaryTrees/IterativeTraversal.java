package Phase2.BinaryTrees;

import java.util.*;

public class IterativeTraversal {
    public static ArrayList<Integer> preorderTraversal(BinaryTreeNode<Integer> root) {
        ArrayList<Integer> sol = new ArrayList<>();
        Stack<BinaryTreeNode<Integer>> nodeTracker = new Stack<>();
        nodeTracker.add(root);
        BinaryTreeNode<Integer> currNode = root;
        while (!nodeTracker.isEmpty() || currNode != null) {
            while (currNode != null) {
                nodeTracker.add(currNode);
                currNode = currNode.left;
            }
            currNode = nodeTracker.pop();
            sol.add(currNode.data);
            currNode = currNode.right;
        }
        return sol;
    }

    public static List<Integer> getInOrderTraversal(TreeNode<Integer> root) {
        ArrayList<Integer> sol = new ArrayList<>();
        Stack<TreeNode<Integer>> nodeTracker = new Stack<>();
        TreeNode<Integer> currNode = root;
        while (!nodeTracker.isEmpty() || currNode != null) {
            while (currNode != null) {
                nodeTracker.add(currNode);
                currNode = currNode.left;
            }
            currNode = nodeTracker.pop();
            sol.add(currNode.data);
            currNode = currNode.right;
        }
        return sol;
    }
}
