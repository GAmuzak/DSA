package Phase2.BinaryTrees;

import java.util.*;

public class TopView {

    public static List<Integer> getTopView(TreeNode root) {
        List<Integer> solList = new ArrayList<>();
        if (root == null)
            return solList;
        TreeMap<Integer, TreeNode> layerTracker = new TreeMap<>();
        Queue<NodeLayerPair> pairs = new LinkedList<>();
        pairs.add(new NodeLayerPair(0, root));
        while (!pairs.isEmpty()) {
            ArrayList<NodeLayerPair> level = new ArrayList<>();
            int size = pairs.size();
            for (int i = 0; i < size; i++) {
                NodeLayerPair currPair = pairs.poll();
                if (!layerTracker.containsKey(currPair.layer)) {
                    layerTracker.put(currPair.layer, currPair.node);
                }
                if (currPair.node.left != null) {
                    level.add(new NodeLayerPair(currPair.layer - 1, currPair.node.left));
                }
                if (currPair.node.right != null) {
                    level.add(new NodeLayerPair(currPair.layer + 1, currPair.node.right));
                }
            }
            pairs.addAll(level);
        }
        for (Map.Entry<Integer, TreeNode> entry : layerTracker.entrySet()) {
            solList.add(entry.getValue().data);
        }
        return solList;
    }
}

class NodeLayerPair {
    int layer;
    TreeNode node;

    public NodeLayerPair(int layer, TreeNode node) {
        this.layer = layer;
        this.node = node;
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
