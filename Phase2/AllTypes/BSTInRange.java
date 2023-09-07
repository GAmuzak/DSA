package Phase2.AllTypes;

import Phase2.BinaryTrees.TreeNode;

public class BSTInRange {

    public static TreeNode<Integer> removeOutsideRange(TreeNode<Integer> root, int min, int max) {
        if (root == null)
            return root;
        root.left = removeOutsideRange(root.left, min, max);
        root.right = removeOutsideRange(root.right, min, max);
        if (root.data < min)
            root = root.right;
        else if (root.data > max)
            root = root.left;
        return root;
    }
}