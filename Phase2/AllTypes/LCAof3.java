package Phase2.AllTypes;

import Phase2.BinaryTrees.BinaryTreeNode;

public class LCAof3 {
    public static BinaryTreeNode<Integer> lcaNode(BinaryTreeNode<Integer> root, int x, int y) {
        if (root == null || root.data == x || root.data == y) {
            return root;
        }
        BinaryTreeNode<Integer> left = lcaNode(root.left, x, y);
        BinaryTreeNode<Integer> right = lcaNode(root.right, x, y);
        if (left == null)
            return right;
        else if (right == null)
            return left;
        else
            return root;
    }

    public static BinaryTreeNode<Integer> lcaOfThreeNodes(BinaryTreeNode<Integer> root, int node1, int node2,
            int node3) {
        BinaryTreeNode<Integer> firstCommon = lcaNode(root, node1, node2);
        BinaryTreeNode<Integer> sol = lcaNode(root, firstCommon.data, node3);
        return sol;
    }
}
