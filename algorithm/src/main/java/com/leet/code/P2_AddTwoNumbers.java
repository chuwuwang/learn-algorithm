package com.leet.code;

/**
 * 2. 两数相加 <p>
 *
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。<p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。<p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。<p>
 *
 * 示例 1：<p>
 * 输入：l1 = [2,4,3], l2 = [5,6,4] <p>
 * 输出：[7,0,8] <p>
 * 解释：342 + 465 = 807. <p>
 *
 * 示例 2：<p>
 * 输入：l1 = [0], l2 = [0] <p>
 * 输出：[0] <p>
 *
 * 示例 3：<p>
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] <p>
 * 输出：[8,9,9,9,0,0,0,1] <p>
 *
 * 提示：<p>
 * 每个链表中的节点数在范围 [1, 100] 内 <p>
 * 0 <= Node.val <= 9 <p>
 * 题目数据保证列表表示的数字不含前导零 <p>
 */
public class P2_AddTwoNumbers {

    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 解法 1
        int carry = 0;
        ListNode temp = new ListNode();

        ListNode result = new ListNode();
        ListNode head = result;
        ListNode prev = null;

        while (l1 != null || l2 != null) {
            int a = l1 != null ? l1.val : 0;
            int b = l2 != null ? l2.val : 0;
            // 存入的结果为a+b+进位数, 再对10取余
            result.val = (a + b + carry) % 10;
            // 计算进位值carry
            carry = (a + b + carry) / 10;
            //若两个节点不为null，就取该节点的下一个节点，否则就取null
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            // 新添一个节点到结果链表, 并将其赋值给result
            result.next = temp;
            prev = result;
            result = result.next;
        }
        // 判断是否进位, 若要进位就把carry存入result节点, 若不需要就把最后一个空节点移除
        if (carry != 0) {
            result.val = carry;
        } else {
            prev.next = null;
        }
        // return head;

        // 解法 2
        ListNode dummyHead = new ListNode(-1);
        ListNode pre = dummyHead;
        int t = 0;
        while (l1 != null || l2 != null || t != 0) {
            if (l1 != null) {
                t += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                t += l2.val;
                l2 = l2.next;
            }
            pre.next = new ListNode(t % 10);
            pre = pre.next;
            t /= 10;
        }
        return dummyHead.next;
    }

    public class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

}
