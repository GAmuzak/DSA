package Phase2.BinaryTrees;

import java.util.Arrays;
import java.util.HashMap;

public class MakeTreeFromTraversal {

    public static HashMap<Integer, Integer> createValueToIndexMap(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }
        return map;
    }

    public static TreeNode buildBinaryTree(int[] inorder, int[] preorder) {
        if (inorder.length == 0 || preorder.length == 0)
            return null;
        TreeNode root = new TreeNode(preorder[0]);
        HashMap<Integer, Integer> inOrderMap = createValueToIndexMap(inorder);
        int mid = inOrderMap.get(preorder[0]);

        int[] leftPreOrder = Arrays.copyOfRange(preorder, 1, mid + 1);
        int[] rightPreOrder = Arrays.copyOfRange(preorder, mid + 1, preorder.length);
        int[] leftInOrder = Arrays.copyOfRange(inorder, 0, mid);
        int[] rightInOrder = Arrays.copyOfRange(inorder, mid + 1, inorder.length);
        root.left = buildBinaryTree(leftInOrder, leftPreOrder);
        root.right = buildBinaryTree(rightInOrder, rightPreOrder);

        return root;
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
