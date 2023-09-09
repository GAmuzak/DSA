package Phase2.BinaryTrees;

public class TNode {
    public int data;
    public TNode left;
    public TNode right;

    public TNode() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    public TNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public TNode(int data, TNode left, TNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
};
