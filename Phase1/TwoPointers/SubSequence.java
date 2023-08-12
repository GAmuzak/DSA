package Phase1.TwoPointers;

import java.util.Scanner;

public class SubSequence {

    public static int findMatch(String sub, String main, int subPosn, int mainPosn) {
        for (int i = mainPosn; i < main.length(); i++) {
            if (sub.charAt(subPosn) == main.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    public static String isSubsequence(String sub, String main) {
        boolean isSub = true;
        int subPosn = 0, mainPosn = 0;
        while (subPosn < sub.length()) {
            int posn = findMatch(sub, main, subPosn, mainPosn);
            if (posn < 0) {
                isSub = false;
                break;
            } else {
                mainPosn = posn;
            }
            subPosn++;
        }
        return isSub?"True":"False";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine().trim();
        String main = sc.nextLine().trim();
        sc.close();
        String op = isSubsequence(sub, main);
        System.out.println(op);
    }
}
