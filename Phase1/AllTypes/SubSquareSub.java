package Phase1.AllTypes;

import java.util.ArrayList;

import Utils.IOHandler;

public class SubSquareSub {
    public static ArrayList<ArrayList<Integer>> sumOfKxKMatrices(ArrayList<ArrayList<Integer>> arr, int k) {
        ArrayList<ArrayList<Integer>> sol = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                row.add(0);
            }
            sol.add(row);
        }
        IOHandler.print2dArrayList(sol);
        return sol;
    }
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> inp = new ArrayList<>();
        sumOfKxKMatrices(inp, 4);
        
    }
}
