package Phase1.AllTypes;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

    public static boolean areAnagram(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char currentChar = str1.charAt(i);
            if (map.containsKey(currentChar)) {
                map.put(currentChar, map.get(currentChar) + 1);
            } else {
                map.put(currentChar, 1);
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            char currentChar = str2.charAt(i);
            if (map.containsKey(currentChar)) {
                if (map.get(currentChar) == 1)
                    map.remove(currentChar);
                else {
                    map.put(currentChar, map.get(currentChar) - 1);
                }
            } else {
                map.put(currentChar, 1);
            }
        }
        return map.size() > 0 ? false : true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().trim();
        String str2 = sc.nextLine().trim();
        sc.close();
        boolean sol = areAnagram(str1, str2);
        System.out.println(sol);
    }
}
