package com.algorithm.linked;

//  How to reverse a listed list ?

public class ReverseLinked {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(7);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        ListNode newHead = new ReverseLinked().loopReverse(head);
        while (newHead != null) {
            System.out.print(newHead.value + " ");
            newHead = newHead.next;
        }
    }

    /**
     * 循环反转链表
     * O(n) O(1)
     */
    public ListNode loopReverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode node = curr.next;
            curr.next = prev;
            prev = curr;
            curr = node;
        }
        return prev;
    }

    /**
     * 递归反转链表
     * O(n) O(n)
     */
    public ListNode recursiveReverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

}