package com.huawei.acm;

import java.util.Scanner;

/**
 * 求最小公倍数
 *
 * 描述
 * 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
 *
 * 数据范围：1 ≤ a, b ≤ 100000
 * 输入描述：
 * 输入两个正整数A和B。
 *
 * 输出描述：
 * 输出A和B的最小公倍数。
 */
public class HJ108 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while ( scanner.hasNext() ) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int k = 1;
            int result;
            while (true) {
                result = k * a;
                int i = result % b;
                if (result % b == 0) {
                    break;
                }
                k++;
            }
            System.out.println(result);
        }
    }

}
