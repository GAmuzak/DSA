package Phase1.ArraysAndStrings.Strings;

public class NextPalindrome {

    public static String nextLargestPalindrome(String number, int length) {
        boolean isOddLength = length%2==1;
        StringBuilder left = new StringBuilder();
        String leftPart = number.substring(0, (length/2));
        left.append(leftPart);
        StringBuilder palin = new StringBuilder(left);
        String center = "";
        if(isOddLength){
            center = number.substring((length/2), (length/2)+1);
            palin.append(center);
        }
        String right = left.reverse().toString();
        palin.append(right);

        

        return "";
	}

    public static void main(String[] args) {
        String inp = "24395";
        String op = nextLargestPalindrome(inp, inp.length());
        System.out.println(op);
    }
}
