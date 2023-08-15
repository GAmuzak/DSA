package Phase1.AllTypes;

public class KthCharOfDecryptedStr {

    public static char kThCharaterOfDecryptedString(String s, Long k) {
        int n = s.length();
        int i = 0;
        while (k > 0 && i < n) {
            StringBuilder substring = new StringBuilder();
            StringBuilder cnt = new StringBuilder();
            // Checking alphabet
            while (i < n && Character.isLetter(s.charAt(i))) {
                substring.append(s.charAt(i));
                i++;
            }
            // Checking number
            while (i < n && Character.isDigit(s.charAt(i))) {
                cnt.append(s.charAt(i));
                i++;
            }
            // Convert cnt to int
            long x = Long.parseLong(cnt.toString());
            // Checking substring
            if (k > x * substring.length()) {
                k -= x * substring.length();
            } else {
                return substring.charAt((int) ((k - 1) % substring.length()));
            }
        }
        return 'O';
    }

    public static void main(String[] args) {
        char op = kThCharaterOfDecryptedString("abc24276bc1293dd1222", 999999999999999999l);
        System.out.println(op);
    }
}
