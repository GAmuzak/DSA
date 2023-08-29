package Phase2.BinaryTrees;

public class DiameterOfBT {

    public static int findDiam(TreeNode node, int[] sol) {
        if (node == null)
            return -1;
        int left = findDiam(node.left, sol);
        int right = findDiam(node.right, sol);
        sol[0] = Math.max(sol[0], left + right + 2);
        return 1 + Math.max(left, right);
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        int[] sol = new int[] { Integer.MIN_VALUE };
        findDiam(root, sol);
        return sol[0];
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}