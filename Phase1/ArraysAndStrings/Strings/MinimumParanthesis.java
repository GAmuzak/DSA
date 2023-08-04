package Phase1.ArraysAndStrings.Strings;

public class MinimumParanthesis {
    public static int minimumParentheses(String pattern) {
		int leftCounter = 0;
        int rightCounter = 0;
        int mainCounter = 0;
        for (char i : pattern.toCharArray()) {
            switch (i){
                case '(':
                    //Left bracket checks
                    if(rightCounter>0){
                        mainCounter+=rightCounter;
                        rightCounter = 0;
                    }
                    leftCounter++;
                    break;
                case ')':
                    //Right bracket checks
                    if(leftCounter>0) leftCounter--;
                    else rightCounter ++;
                    break;
                default: System.err.println("Not Bracket");
            }
        }
        mainCounter+=rightCounter;
        mainCounter+=leftCounter;
        return mainCounter;
	}

    public static void main(String[] args) {
        String inp = ")())";
        int sol = minimumParentheses(inp);
        System.out.println(sol);
    }
}

