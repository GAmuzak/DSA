package Phase2.BinaryTrees;

public class BinTreeNode {
    int data;
    BinTreeNode left;
    BinTreeNode right;

    BinTreeNode() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    BinTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    BinTreeNode(int data, BinTreeNode left, BinTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
};