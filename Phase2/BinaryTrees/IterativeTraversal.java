package Phase2.BinaryTrees;

import java.util.*;

import Utils.IOHandler;

public class IterativeTraversal {
    public static ArrayList<Integer> preorderTraversal(BinaryTreeNode<Integer> root) {
        ArrayList<Integer> sol = new ArrayList<>();
        if (root == null)
            return sol;
        Stack<BinaryTreeNode<Integer>> nodeTracker = new Stack<>();
        nodeTracker.push(root);
        while (!nodeTracker.isEmpty()) {
            BinaryTreeNode<Integer> currNode = nodeTracker.pop();
            sol.add(currNode.data);
            if (currNode.right != null)
                nodeTracker.push(currNode.right);
            if (currNode.left != null)
                nodeTracker.push(currNode.left);
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

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(3);
        root.left = new BinaryTreeNode<Integer>(1);
        root.right = new BinaryTreeNode<Integer>(2);
        ArrayList<Integer> sol = preorderTraversal(root);
        IOHandler.printArrayList(sol);
    }
}
