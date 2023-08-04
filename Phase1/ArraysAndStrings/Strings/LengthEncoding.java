package Phase1.ArraysAndStrings.Strings;

public class LengthEncoding {

    public static String encode(String message) {
        StringBuilder encodedString = new StringBuilder();
        encodedString.append(message.charAt(0));
        int counter = 1;
        for (int i = 1; i < message.length(); i++) {
            if(message.charAt(i)==message.charAt(i-1)){
                counter++;
            }
            else{
                encodedString.append(counter);
                encodedString.append(message.charAt(i));
                counter = 1;
            }
        }
        encodedString.append(counter);
        return encodedString.toString();
	}

    public static void main(String[] args) {
        String inp = "aaaabbbjjjjdwddwff";
        String op = encode(inp);
        System.out.println(op);
    }
}
