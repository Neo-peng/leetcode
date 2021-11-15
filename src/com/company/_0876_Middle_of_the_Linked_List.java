package com.company;

public class _0876_Middle_of_the_Linked_List {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null) {
            slow =  slow.next;
            fast = fast.next.next;
            if (fast == null) {
                return slow;
            }
        }
        return slow;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
