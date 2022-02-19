package com.huawei.acm;

import java.util.Scanner;

/**
 * 输出单向链表中倒数第k个结点
 *
 * 输入一个单向链表，输出该链表中倒数第k个结点，链表的倒数第1个结点为链表的尾指针。
 *
 * 链表结点定义如下：
 * struct ListNode {
 *    int       m_nKey;
 *    ListNode* m_pNext;
 * };
 * 正常返回倒数第k个结点指针，异常返回空指针
 *
 * 数据范围：链表长度满足 1 ≤ n ≤ 1000  ， k ≤ n  ，链表中数据满足 0 ≤ val ≤ 10000
 *
 * 本题有多组样例输入。
 *
 * 输入描述：
 * 输入说明
 * 1 输入链表结点个数
 * 2 输入链表的值
 * 3 输入k的值
 *
 * 输出描述：
 * 输出一个整数
 */
public class HJ51 {

    // 快慢指针
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while ( scanner.hasNext() ) {
            int size = scanner.nextInt();
            // 尾插法
            ListNode head = null;
            ListNode read = null;
            for (int i = 0; i < size; i++) {
                int val = scanner.nextInt();
                ListNode node = new ListNode(val);
                if (read != null) {
                    read.next = node;
                } else {
                    head = node;
                }
                read = node;
            }
            int k = scanner.nextInt();
            ListNode fast = head;
            int j = size - k;
            if (j < 0) {
                System.out.println("null");
                return;
            }
            if (j == 0) {
                System.out.println(fast.val);
                return;
            }
            while (j > 0) {
                fast = fast.next;
                j--;
            }
            System.out.println(fast.val);
        }
    }

    static class ListNode {
        public ListNode(int val) {
            this.val = val;
        }

        public int val;
        public ListNode next;
    }

}