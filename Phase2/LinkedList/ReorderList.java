package Phase2.LinkedList;

public class ReorderList {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode curr = head, next = head.next, prev = null;
        while (next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        return curr;
    }

    public static ListNode getMidNode(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode slow = head, fast = head.next;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.next;
    }

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return;
        ListNode mid = getMidNode(head);
        ListNode rightReversed = reverseList(mid);
        ListNode main = new ListNode(0), left = head, right = rightReversed;
        ListNode base = main;
        int turn = 0;
        while (left != null && right != null) {
            if (turn % 2 == 0) {
                main.next = left;
                left = left.next;
            } else {
                main.next = right;
                right = right.next;
            }
            turn++;
            main = main.next;
        }
        if (left != null) {
            main.next = left;
        }
        if (right != null) {
            main.next = right;
        }
        main.next = null;
        head = base.next;
        return;
    }

    public static void main(String[] args) {
        ListNode inp = new ListNode(0);
        ListNode head = inp;
        for (int i = 0; i < 15; i++) {
            int rand = (int) ((Math.random() * (99 - 1)) + 1);
            inp.next = new ListNode(rand);
            inp = inp.next;
            inp.val = rand;
        }
        head = head.next;
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;

        }
        System.out.println();
        reorderList(head);
        ListNode sol = head;
        int i = 0;
        while (sol != null) {
            System.out.print(sol.val + " ");
            sol = sol.next;
            i++;
            if (i > 40)
                break;
        }
    }
}

