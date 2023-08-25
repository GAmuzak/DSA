package Phase1.ArraysAndStrings.Strings;

public class ReverseWords {
    public static String reverseString(String str) {
        String[] words = str.split(" ");
        StringBuilder sol = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sol.append(words[i] + " ");
        }
        if (sol.length() > 1)
            sol.deleteCharAt(sol.length() - 1);
        return sol.toString();
    }

    public static void main(String[] args) {
        String inp = "This is a Test";
        String sol = reverseString(inp);
        System.out.println(sol);
    }
}
