package Phase2.BinaryTrees;

public class TNode {
    int data;
    TNode left;
    TNode right;

    TNode() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    TNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    TNode(int data, TNode left, TNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
};
