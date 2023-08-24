package Phase2.Recursion;

import java.util.*;

public class KthGen {

    public static String flip(String gen) {
        if (gen.equals("Male"))
            return "Female";
        else
            return "Male";
    }

    public static String kthChildNthGeneration(int n, long k) {
        if (n == 1)
            return "Male";
        long ParentK = (k + 1) / 2;
        String parent = kthChildNthGeneration(n - 1, ParentK);
        if (k % 2 == 1) {
            return parent;
        } else {
            return flip(parent);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        long k = Long.parseLong(sc.nextLine());
        sc.close();
        String sol = kthChildNthGeneration(n, k);
        System.out.println(sol);
    }
}
