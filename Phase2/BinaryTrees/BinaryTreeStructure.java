package Phase2.BinaryTrees;

public class BinaryTreeStructure {
    class Node {
        private int value;
        private Node left;
        private Node right;

        Node() {
            value = 0;
            left = null;
            right = null;
        }

        public int getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
