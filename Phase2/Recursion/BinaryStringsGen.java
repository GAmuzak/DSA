package Phase2.Recursion;

import java.util.ArrayList;
import java.util.List;

import Utils.IOHandler;

public class BinaryStringsGen {

    public static List<String> genRec(int N, int current, List<String> arrList) {
        if (N == current)
            return arrList;
        ArrayList<String> newGens = new ArrayList<>();
        for (int i = 0; i < arrList.size(); i++) {
            String bs = arrList.get(i);
            newGens.add(bs + "0");
            if (bs.charAt(bs.length() - 1) != '1') {
                newGens.add(bs + "1");
            }
        }
        arrList.clear();
        arrList.addAll(newGens);
        return genRec(N, current + 1, arrList);
    }

    public static List<String> generateString(int N) {
        List<String> mainList = new ArrayList<>();
        mainList.add("0");
        mainList.add("1");
        mainList = genRec(N, 1, mainList);
        return mainList;
    }

    public static void main(String[] args) {
        int n = 4;
        List<String> sol = generateString(n);
        ArrayList<String> ans = new ArrayList<>(sol);
        System.out.println("Final");
        IOHandler.printArrayList(ans);
    }
}
