package Phase2.BinaryTrees;

public class BSTDelete {

    public static BinaryTreeNode<Integer> bstDelete(BinaryTreeNode<Integer> root, int key) {
        if (root == null)
            return root;
        if (root.data > key)
            root.left = bstDelete(root.left, key);
        else if (root.data < key)
            root.right = bstDelete(root.right, key);
        else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            else {
                BinaryTreeNode<Integer> currNode = root.right;
                while (currNode.left != null)
                    currNode = currNode.left;
                root.data = currNode.data;
                root.right = bstDelete(root.right, currNode.data);
            }
        }
        return root;
    }
}


