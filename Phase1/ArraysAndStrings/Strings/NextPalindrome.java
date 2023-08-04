package Phase1.ArraysAndStrings.Strings;

public class NextPalindrome {

    public static String generatePalindromeRight(StringBuilder numLeft, int isEven){
        StringBuilder palin = new StringBuilder(numLeft);
        for (int i = numLeft.length()-1 -isEven; i >=0; i--) {
            palin.append(numLeft.charAt(i));
        }
        return palin.toString();
    }

    public static String nextLargestPalindrome(String number) {
		int cutoffLength = 0;
        int isEven = number.length()%2;
        if(isEven==0) cutoffLength = number.length()/2;
        else cutoffLength = number.length()/2 +1;
        String lp = number.substring(0, cutoffLength);
        StringBuilder leftPart = new StringBuilder(lp);
        String newNum = generatePalindromeRight(leftPart, isEven);
        while(Integer.parseInt(number)>Integer.parseInt(newNum)){
            int lastIndex = leftPart.length()-1;
            if(leftPart.charAt(lastIndex)=='9'){
                leftPart.setCharAt(lastIndex, (char)('0'));
                int secondLast = leftPart.charAt(lastIndex-1)-'0';
                secondLast++;
                leftPart.setCharAt(lastIndex-1, (char)(secondLast+'0'));
            }
            else{
                int lastDigit = leftPart.charAt(lastIndex) - '0';
                lastDigit++;
                leftPart.setCharAt(lastIndex, (char)(lastDigit + '0'));
            }
            newNum = generatePalindromeRight(leftPart, isEven);
        }
        return newNum;
	}

    public static void main(String[] args) {
        String inp = "24956";
        String op = nextLargestPalindrome(inp);
        System.out.println(op);
    }
}
