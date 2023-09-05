package Phase2.BinaryTrees;

public class PartialBST {

    public static boolean isValid(BinaryTreeNode<Integer> node, int left, int right) {
        if (node == null) {
            return true;
        }
        if (!(node.data > left && node.data < right))
            return false;
        return (isValid(node.left, left, node.data) && isValid(node.right, node.data, right));
    }

    public static boolean validateBST(BinaryTreeNode<Integer> root) {
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}