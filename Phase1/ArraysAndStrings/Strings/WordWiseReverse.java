package Phase1.ArraysAndStrings.Strings;

import java.util.Scanner;

public class WordWiseReverse {
    static String reverseStringWordWise(String input) {
        String reversedString = "";
        String[] words = input.split(" ");
        for (int i = words.length-1; i >=0 ; i--) {
            reversedString+=words[i];
            if(i!=0) reversedString+=" ";
        }
        return reversedString;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
        sc.close();
    }
}
