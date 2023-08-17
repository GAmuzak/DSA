package Phase1.AllTypes;

import java.util.ArrayList;

import Utils.Converter;
import Utils.IOHandler;

public class MultiplyStrings {

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int[] reverseArray(int[] array) {
        int length = array.length;
        int[] reversed = new int[length];
        for (int i = 0; i < length; i++) {
            reversed[length - 1 - i] = array[i];
        }
        return reversed;
    }

    public static String multiplyStrings(String a, String b) {
        if (a.equals("0") || b.equals("0"))
            return "0";
        int[] res = new int[a.length() + b.length()];
        a = reverseString(a);
        b = reverseString(b);
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                int prod = (a.charAt(i) - '0') * (b.charAt(j) - '0');
                int sum = res[i + j] + prod;
                res[i + j] = sum % 10;
                res[i + j + 1] += sum / 10;
            }
        }
        res = reverseArray(res);
        StringBuilder finalSol = new StringBuilder();
        boolean leadingZeroes = true; 
        for (int i = 0; i < res.length; i++) {
            if (leadingZeroes) {
                if (res[i] != 0)
                    leadingZeroes = false;
                else {
                    continue;
                }
            }
            finalSol.append(res[i]);
        }
        System.out.println(finalSol);
        return finalSol.toString();
    }

    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "456";
        String mul = multiplyStrings(s1, s2);
        System.out.println(mul);
    }
}
