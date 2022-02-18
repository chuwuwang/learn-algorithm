package com.huawei.acm;

import java.util.Scanner;

/**
 * 字符串反转
 *
 * 描述
 * 接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
 *
 * 输入描述：
 * 输入一行，为一个只包含小写字母的字符串。
 *
 * 输出描述：
 * 输出该字符串反转后的字符串。
 */
public class HJ12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while ( scanner.hasNext() ) {
            String line = scanner.nextLine();
            char[] chars = line.toCharArray();
            for (int i = chars.length - 1; i >= 0 ; i--) {
                char c = chars[i];
                System.out.print(c);
            }
            System.out.println();
        }
    }

}