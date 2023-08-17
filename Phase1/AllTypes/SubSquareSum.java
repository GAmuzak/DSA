package Phase1.AllTypes;

import java.util.ArrayList;

public class SubSquareSum {
    public static ArrayList<ArrayList<Integer>> sumOfKxKMatrices(ArrayList<ArrayList<Integer>> arr, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.size() - k; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < arr.get(i).size() - k; j++) {
                int sum = 0;
                for (int x = i; x < i + k; x++) {
                    for (int y = j; y < j + k; y++) {
                        sum += arr.get(x).get(y);
                    }
                }
                row.add(sum);
            }
            ans.add(row);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> inp = new ArrayList<>();
        sumOfKxKMatrices(inp, 4);

    }
}
