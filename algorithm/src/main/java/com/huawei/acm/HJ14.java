package com.huawei.acm;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * 字符串排序
 *
 * 描述
 * 给定 n 个字符串，请对 n 个字符串按照字典序排列。
 *
 * 数据范围： 1 ≤ n ≤ 1000  ，字符串长度满足 1 ≤ len ≤ 100
 * 输入描述：
 * 输入第一行为一个正整数n (1 ≤ n ≤ 1000),下面n行为n个字符串(字符串长度 ≤ 100),字符串中只含有大小写字母。
 * 输出描述：
 * 数据输出n行，输出结果为按照字典序排列的字符串。
 */
public class HJ14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> treeSet = new TreeSet<>();
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            String str = scanner.nextLine();
            treeSet.add(str);
        }
        for (String value : treeSet) {
            System.out.println(value);
        }
    }

}
