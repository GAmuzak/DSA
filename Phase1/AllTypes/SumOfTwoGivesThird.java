package Phase1.AllTypes;

import java.util.ArrayList;
import java.util.HashSet;

import Utils.IOHandler;

public class SumOfTwoGivesThird {

    public static ArrayList<Integer> findTriplets(int[] arr, int n) {
        HashSet<Integer> sums = new HashSet<>();
        ArrayList<Integer> sol = new ArrayList<>();
        outer: for (int i = 0; i < arr.length; i++) {
            int firstElement = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int secondElement = arr[j];
                int sum = secondElement + firstElement;
                if (sums.contains(sum)) {
                    sol.add(firstElement);
                    sol.add(secondElement);
                    sol.add(sum);
                    break outer;
                } else {
                    sums.add(secondElement);
                }
            }
            sums.add(firstElement);
        }
        return sol;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 5, 6, 2 };
        ArrayList<Integer> sol = findTriplets(arr, arr.length);
        IOHandler.printArrayList(sol);
    }
}