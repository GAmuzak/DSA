package Phase1.MapsAndSets;

import java.util.HashMap;


public class NonRepeatingChar {
    public static char firstNonRepeatingCharacter(String str) {
        HashMap<Character, Integer> cTrack = new HashMap<Character, Integer>();
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (cTrack.containsKey(currentChar)) {
                int count = cTrack.get(currentChar);
                count++;
                cTrack.put(currentChar, count);
            }
            else {
                cTrack.put(currentChar, 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (cTrack.get(currentChar) == 1) {
                return currentChar;
            }
        }
        return str.charAt(0);
    }
    
    public static void main(String[] args) {
        String inp = "kgsxdkasykkoaeoofkvivxne";
        char op = firstNonRepeatingCharacter(inp);
        System.out.println(op);
    }
}
