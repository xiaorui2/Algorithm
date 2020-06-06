import java.util.Scanner;

public class Problem16 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode Merge(ListNode l1,ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head = null;
        if (l1.val <= l2.val){
            head = l1;
            head.next = Merge(l1.next, l2);
        } else {
            head = l2;
            head.next = Merge(l1, l2.next);
        }
        return head;
    }

    public static ListNode Merge1(ListNode l1,ListNode l2) {
        ListNode head = new ListNode(-1);
        head.next = null;
        ListNode root = head;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val){
                head.next = l1;
                head = l1;
                l1 = l1.next;
            }
            else {
                head.next = l2;
                head = l2;
                l2 = l2.next;
            }
        }
        //如果有一个链表为空，另一个链表非空，则应该把非空链表合并到链表尾部。
        if(l1 != null) {
            head.next = l1;
        }
        if(l2 != null) {
            head.next = l2;
        }
        return root.next;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
    }
}
