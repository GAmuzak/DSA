package Phase2.StacksAndQueues;

import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValidParenthesis(String s) {
        Stack<Character> brackets = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '}':
                    if (brackets.isEmpty())
                        return false;
                    if (brackets.peek() == '{')
                        brackets.pop();
                    else
                        return false;
                    break;
                case ')':
                    if (brackets.isEmpty())
                        return false;
                    if (brackets.peek() == '(')
                        brackets.pop();
                    else
                        return false;
                    break;
                case ']':
                    if (brackets.isEmpty())
                        return false;
                    if (brackets.peek() == '[')
                        brackets.pop();
                    else
                        return false;
                    break;
                default:
                    brackets.add(c);
                    break;
            }
        }
        return brackets.isEmpty();
    }

    public static void main(String[] args) {
        String inp = "[()]{}){[()()]()}";
        boolean sol = isValidParenthesis(inp);
        System.out.println(sol);
    }
}
