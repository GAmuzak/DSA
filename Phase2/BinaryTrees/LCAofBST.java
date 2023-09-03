package Phase2.BinaryTrees;

public class LCAofBST {
    public static TreeNode LCAinaBST(TreeNode root, TreeNode p, TreeNode q) {
        boolean pLess = (int) p.data < (int) q.data;
        int lesser = pLess ? (int) p.data : (int) q.data;
        int greater = pLess ? (int) q.data : (int) p.data;
        while (root != null) {
            if (lesser <= (int) root.data && greater >= (int) root.data)
                return root;
            else if (lesser > (int) root.data)
                root = root.right;
            else
                root = root.left;
        }
        return null;
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
};