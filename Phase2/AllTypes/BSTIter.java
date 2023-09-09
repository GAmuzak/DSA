package Phase2.AllTypes;

import java.util.ArrayList;
import java.util.Stack;

import Phase2.BinaryTrees.TreeNode;

public class BSTIter {
    static class BSTIterator {

        TreeNode<Integer> root;
        TreeNode<Integer> currNode;
        ArrayList<Integer> sol;
        Stack<TreeNode<Integer>> nodeTracker;
        int currIdx;

        BSTIterator(TreeNode<Integer> root) {
            this.root = root;
            sol = new ArrayList<>();
            nodeTracker = new Stack<>();
            currNode = this.root;
            while (!nodeTracker.isEmpty() || currNode != null) {
                while (currNode != null) {
                    nodeTracker.add(currNode);
                    currNode = currNode.left;
                }
                currNode = nodeTracker.pop();
                sol.add(currNode.data);
                currNode = currNode.right;
            }
            currIdx = 0;
        }

        int next() {
            if (!hasNext())
                return -1;
            int val = sol.get(currIdx);
            currIdx++;
            return val;
        }

        boolean hasNext() {
            if (currIdx >= sol.size())
                return false;
            return true;
        }
    }
}
