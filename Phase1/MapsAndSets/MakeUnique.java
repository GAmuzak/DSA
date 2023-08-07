package Phase1.MapsAndSets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MakeUnique {
    public static int minElementsToRemove(ArrayList<Integer> arr) {
        Set<Integer> mySet = new HashSet<Integer>();
        int ctr = 0;
        for (Integer integer : arr) {
            boolean added = mySet.add(integer);
            ctr += added? 0 : 1;
        }
        return ctr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(2);
        arr.add(4);
        arr.add(4);
        arr.add(3);
        int sol = minElementsToRemove(arr);
        System.out.println(sol);
    }
}
