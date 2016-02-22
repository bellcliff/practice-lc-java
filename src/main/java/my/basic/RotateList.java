package my.basic;

import my.base.ListNode;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode h = new ListNode(0), cur, tail;
        h.next = cur = head;

        // get current tail
        while (cur.next != null) cur = cur.next;
        tail = cur;

        while (k > 0) {
            cur = h.next;
            h.next = cur.next;
            cur.next = null;
            tail.next = cur;
            tail = tail.next;
            k--;
        }

        return h.next;
    }

    public ListNode rotateRightAsCircle(ListNode head, int k){
        ListNode tail = head;
        while (tail.next != null) tail = tail.next;
        tail.next = head;
        while (0 < k--) {
            head = head.next;
            tail = tail.next;
        }
        tail.next = null;
        return head;
    }
}
