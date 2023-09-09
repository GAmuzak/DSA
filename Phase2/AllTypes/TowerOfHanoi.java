package Phase2.AllTypes;

import java.util.ArrayList;

public class TowerOfHanoi {
    public static ArrayList<ArrayList<Integer>> towerOfHanoi(int n) {
        ArrayList<ArrayList<Integer>> moves = new ArrayList<ArrayList<Integer>>();
        helper(n, 1, 2, 3, moves);
        return moves;
    }

    private static void helper(int n, int src, int dest, int aux, ArrayList<ArrayList<Integer>> moves) {
        if (n == 0)
            return;
        helper(n - 1, src, aux, dest, moves);
        ArrayList<Integer> move = new ArrayList<>();
        move.add(src);
        move.add(dest);
        moves.add(move);
        helper(n-1, aux, dest, src, moves);
    }
}
