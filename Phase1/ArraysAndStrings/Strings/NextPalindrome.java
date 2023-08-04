package Phase1.ArraysAndStrings.Strings;

import java.math.BigInteger;

public class NextPalindrome {

    public static StringBuilder incLeft (StringBuilder left){
        StringBuilder newLeft = new StringBuilder(left);
        int index = left.length()-1;
        while (left.charAt(index)=='9') {
            newLeft.setCharAt(index, '0');
            index--;
        }
        int finalNum = (left.charAt(index)-'0') + 1;
        newLeft.setCharAt(index, (char)(finalNum+'0'));
        return newLeft;
    }

    public static String nextLargestPalindrome(String number, int length) {
        //left
        String leftPart = number.substring(0, (length/2));
        StringBuilder left = new StringBuilder();
        left.append(leftPart);
        StringBuilder palin = new StringBuilder(left);
        //center, if exists
        boolean isOddLength = length%2==1;
        String center = "";
        if(isOddLength){
            center = number.substring((length/2), (length/2)+1);
            palin.append(center);
        }
        //right
        StringBuilder right = new StringBuilder(left);
        right = right.reverse();
        palin.append(right);
        //if palindrome not greater
        BigInteger mainNum = new BigInteger(number);
        BigInteger palindromeNum = new BigInteger(palin.toString());
        if(mainNum.compareTo(palindromeNum)>=0){
            if(isOddLength){
                int centerNum = Integer.parseInt(center);
                if(centerNum!=9){
                    //ez case, automatically greater
                    centerNum++;
                    palin = new StringBuilder(left);
                    palin.append(centerNum);
                    palin.append(right);
                    return palin.toString();
                }
                else{
                    center = "0";
                }
            }
            
            StringBuilder all9 = new StringBuilder();
            for (int i = 0; i < left.length(); i++) {
                all9.append("9");
            }
            if(left.toString().equals(all9.toString())){
                palin = new StringBuilder("1");
                for (int i = 0; i < length-1; i++) {
                    palin.append('0');
                }
                palin.append(1);
                return palin.toString();
            }
            else{
                left = incLeft(left);
                palin = new StringBuilder(left);
                palin.append(center);
                right = new StringBuilder(left);
                right = right.reverse();
                palin.append(right);
                return palin.toString();
            }

        }

        return palin.toString();
	}

    public static void main(String[] args) {
        String inp = "12462788885278";
        String op = nextLargestPalindrome(inp, inp.length());
        System.out.println(op);
    }
}
