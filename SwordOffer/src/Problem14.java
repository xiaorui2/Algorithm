import java.util.Scanner;

public class Problem14 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode FindKthToTail(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        int i = 0;
        for (; first != null; i++) {
            if (i >= k)
                second = second.next;
            first = first.next;
        }
        if (i < k)
            return null;
        else
            return second;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
    }
}
