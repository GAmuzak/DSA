package Phase1.AllTypes;

import java.util.ArrayList;
import java.util.HashMap;

public class Nby3Repeating {

    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
        ArrayList<Integer> repeating = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            int currentElement = arr.get(i);
            if (map.containsKey(currentElement)) {
                map.put(currentElement, map.get(currentElement) + 1);
            } else {
                map.put(currentElement, 1);
            }
        }
        int n = arr.size() / 3;
        for (Integer key : map.keySet()) {
            if (map.get(key) > n)
                repeating.add(key);
        }
        return repeating;
    }
}
