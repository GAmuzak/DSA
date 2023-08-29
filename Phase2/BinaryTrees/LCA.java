package Phase2.BinaryTrees;

public class LCA {

    public static TreeNode<Integer> lcaNode(TreeNode<Integer> root, int x, int y) {
        if (root == null || root.data == x || root.data == y) {
            return root;
        }
        TreeNode<Integer> left = lcaNode(root.left, x, y);
        TreeNode<Integer> right = lcaNode(root.right, x, y);
        if (left == null)
            return right;
        else if (right == null)
            return left;
        else
            return root;
    }

    public static int lowestCommonAncestor(TreeNode<Integer> root, int x, int y) {
        TreeNode<Integer> solNode = lcaNode(root, x, y);
        return solNode.data;
    }
}

class TreeNode<T> {
    T data;
    TreeNode<T> left;
    TreeNode<T> right;

    TreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
};