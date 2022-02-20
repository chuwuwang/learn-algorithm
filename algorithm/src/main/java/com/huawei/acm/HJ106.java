package com.huawei.acm;

import java.util.Scanner;

/**
 * 字符逆序
 *
 * 描述
 * 将一个字符串str的内容颠倒过来，并输出。
 *
 * 数据范围：1 ≤ len(str) ≤ 10000
 * 输入描述：
 * 输入一个字符串，可以有空格
 *
 * 输出描述：
 * 输出逆序的字符串
 */
public class HJ106 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while ( scanner.hasNext() ) {
            String str = scanner.nextLine();
            StringBuilder builder = new StringBuilder(str);
            String string = builder.reverse().toString();
            System.out.println(string);
        }
    }

}
