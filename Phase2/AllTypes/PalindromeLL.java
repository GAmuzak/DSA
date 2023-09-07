package Phase2.AllTypes;

import java.util.Stack;

import Phase2.LinkedList.LinkedListNode;

public class PalindromeLL {

    public static boolean isPalindrome(LinkedListNode head) {
        Stack<Integer> stack = new Stack<>();
        LinkedListNode temp = head;
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        while (head != null) {
            if (!(head.data == (stack.pop()))) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
