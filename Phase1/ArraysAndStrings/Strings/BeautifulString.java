package Phase1.ArraysAndStrings.Strings;

public class BeautifulString {

    public static String generateBeautiful(int length, int startNum){
        StringBuilder bString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int currentNum = Math.abs(i%2-startNum);
            bString.append(currentNum);
        }
        return bString.toString();
    }

    public static int makeBeautiful(String str) {
        String start0 = generateBeautiful(str.length(), 0);
        String start1 = generateBeautiful(str.length(), 1);
        int ctr0Start = 0;
        int ctr1Start = 0;
        for (int i = 0; i < str.length(); i++) {
            if(start0.charAt(i)!=str.charAt(i)){
                ctr0Start++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if(start1.charAt(i)!=str.charAt(i)){
                ctr1Start++;
            }
        }

        return ctr0Start>ctr1Start?ctr1Start:ctr0Start;
    }
    public static void main(String[] args) {
        String inp = "1001010";
        int op = makeBeautiful(inp);
        System.out.println(op);
    }
}
