package com.company;

public class _0876_Middle_of_the_Linked_List {
    public ListNode middleNode(ListNode head) {
        return _middleNode(head, 0, numNodesLeft(head));
    }
    public ListNode _middleNode(ListNode head, int numAhead, int numBehind) {
        if (numAhead == numBehind || numAhead - 1 == numBehind) {
            return head;
        } else  {
            return _middleNode(head.next, numAhead + 1, numNodesLeft(head.next));
        }
    }

    public int numNodesLeft(ListNode head) {
        return _numNodesLeft(head, 0);
    }

    public int _numNodesLeft(ListNode head, int pre) {
        if (head.next != null) {
            return _numNodesLeft(head.next, pre + 1);
        } else {
            return pre;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
