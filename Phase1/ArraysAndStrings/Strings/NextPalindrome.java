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
        StringBuilder right = new StringBuilder(left);
        right = right.reverse();
        palin.append(right);

        if(Integer.parseInt(number)>Integer.parseInt(palin.toString())){
            if(isOddLength){
                int centerNum = Integer.parseInt(center);
                if(centerNum!=9){
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

            
        }

        return palin.toString();
	}

    public static void main(String[] args) {
        String inp = "24956";
        String op = nextLargestPalindrome(inp, inp.length());
        System.out.println(op);
    }
}
