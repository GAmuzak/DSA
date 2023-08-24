package Phase2.LinkedList;

public class AddTwoNums {
    static LinkedListNode addTwoNumbers(LinkedListNode l1, LinkedListNode l2) {
        LinkedListNode num1 = l1, num2 = l2, sum = new LinkedListNode(0);
        LinkedListNode sol = sum;
        int carry = 0;
        while (num1 != null || num2 != null) {
            LinkedListNode currNum = new LinkedListNode(0);
            int currSum = 0;
            if (num1 != null) {
                currSum += num1.data;
                num1 = num1.next;
            }
            if (num2 != null) {
                currSum += num2.data;
                num2 = num2.next;
            }
            currSum += carry;
            currNum.data = currSum % 10;
            carry = currSum / 10;
            sum.next = currNum;
            sum = sum.next;
        }
        if (carry != 0)
            sum.next = new LinkedListNode(carry);
        return sol.next;
    }

    public static void main(String[] args) {
        LinkedListNode num1 = new LinkedListNode(2);
        num1.next = new LinkedListNode(4);
        num1.next.next = new LinkedListNode(3);
        LinkedListNode num2 = new LinkedListNode(5);
        num2.next = new LinkedListNode(6);
        num2.next.next = new LinkedListNode(7);
        LinkedListNode sol = addTwoNumbers(num1, num2);
        while (sol != null) {
            System.out.print(sol.data + " ");
            sol = sol.next;
        }
    }
}