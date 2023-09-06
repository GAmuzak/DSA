package Phase2.BinaryTrees;

import java.util.*;

public class VerticalOrderTraversal {

    public static void addToMap(TreeMap<Integer, ArrayList<Integer>> columnTrack, int layer, int data) {
        if (columnTrack.containsKey(layer)) {
            columnTrack.get(layer).add(data);
        } else {
            ArrayList<Integer> newList = new ArrayList<>();
            newList.add(data);
            columnTrack.put(layer, newList);
        }
    }

    public static ArrayList<Integer> verticalOrderTraversal(TreeNode<Integer> root) {
        ArrayList<Integer> sol = new ArrayList<>();
        TreeMap<Integer, ArrayList<Integer>> columnTrack = new TreeMap<>();
        Queue<NodeLayerPair> pairs = new LinkedList<>();
        pairs.add(new NodeLayerPair(0, root));
        while (!pairs.isEmpty()) {
            int size = pairs.size();
            ArrayList<NodeLayerPair> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                NodeLayerPair currPair = pairs.poll();
                addToMap(columnTrack, currPair.layer, currPair.node.data);
                if (currPair.node.left != null) {
                    level.add(new NodeLayerPair(currPair.layer - 1, currPair.node.left));
                }
                if (currPair.node.right != null) {
                    level.add(new NodeLayerPair(currPair.layer + 1, currPair.node.right));
                }
            }
            pairs.addAll(level);
        }
        for (Map.Entry<Integer, ArrayList<Integer>> entry : columnTrack.entrySet()) {
            sol.addAll(entry.getValue());
        }
        return sol;
    }
}

class NodeLayerPair {
    int layer;
    TreeNode<Integer> node;

    public NodeLayerPair(int layer, TreeNode<Integer> node) {
        this.layer = layer;
        this.node = node;
    }
}

