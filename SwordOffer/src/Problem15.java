import java.util.Scanner;

public class Problem15 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode ReverseList(ListNode head) {
        ListNode now = head;
        ListNode pre = null;
        ListNode aft = head.next;
        while (now != null) {
            aft = now.next;
            now.next = pre;
            pre = now;
            now = aft;
        }
        return pre;
    }

    public static ListNode ReverseList1(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode reverseHead = ReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverseHead;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
    }
}
