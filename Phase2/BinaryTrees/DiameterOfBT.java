package Phase2.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class DiameterOfBT {

    public static int diameterOfBinaryTree(TreeNode<Integer> root) {
        if (root == null)
            return 0;
        int maxDiameter = 0;
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode<Integer> current = queue.poll();
            int leftHeight = 0;
            int rightHeight = 0;
            TreeNode<Integer> left = current.left;
            TreeNode<Integer> right = current.right;
            while (left != null) {
                leftHeight++;
                left = left.left;
            }
            while (right != null) {
                rightHeight++;
                right = right.right;
            }
            maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);
            if (current.left != null)
                queue.offer(current.left);
            if (current.right != null)
                queue.offer(current.right);
        }
        return maxDiameter;
    }
}

class TreeNode<T> {
    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;

    TreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
}