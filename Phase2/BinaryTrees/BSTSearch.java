package Phase2.BinaryTrees;

public class BSTSearch {
    public static boolean searchInBST(BinaryTreeNode root, int x) {
        BinaryTreeNode currNode = root;
        while (currNode!=null) {
            if (currNode.data == x)
                return true;
            else if (currNode.data > x)
                currNode = currNode.left;
            else if (currNode.data < x)
                currNode = currNode.right;
        }
        return false;
    }
}

class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    BinaryTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    BinaryTreeNode(int data, BinaryTreeNode left, BinaryTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
};
