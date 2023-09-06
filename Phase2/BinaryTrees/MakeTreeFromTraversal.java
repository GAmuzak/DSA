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

    public static TNode buildBinaryTree(int[] inorder, int[] preorder) {
        if (inorder.length == 0 || preorder.length == 0)
            return null;
        TNode root = new TNode(preorder[0]);
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
