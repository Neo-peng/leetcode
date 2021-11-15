package com.company;

public class _0019_removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = dummy, second = dummy;
        for (int i =0; i< n; i++) {
            second = second.next;
        }
        while (second.next != null) {
            first = first.next;
            second = second.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }
}
