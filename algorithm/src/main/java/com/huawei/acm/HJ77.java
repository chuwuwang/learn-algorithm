package com.huawei.acm;

import java.util.*;

/**
 * 火车进站
 *
 * 描述
 * 给定一个正整数N代表火车数量，0 < N < 10，接下来输入火车入站的序列，一共N辆火车，每辆火车以数字1-9编号，火车站只有一个方向进出，同时停靠在火车站的列车中，只有后进站的出站了，先进站的才能出站。
 * 要求输出所有火车出站的方案，以字典序排序输出。
 *
 * 数据范围：1 ≤ n ≤ 10
 *
 * 进阶：时间复杂度：O(n!) ，空间复杂度：O(n)
 *
 * 输入描述：
 * 有多组测试用例，每一组第一行输入一个正整数N（0
 *
 * 输出描述：
 * 输出以字典序从小到大排序的火车出站序列号，每个编号以空格隔开，每个输出序列换行，具体见sample。
 */
public class HJ77 {

    private static final Stack<Integer> stack1 = new Stack<>();
    private static final Stack<Integer> stack2 = new Stack<>();
    private static final List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while ( scanner.hasNext() ) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String line = scanner.nextLine();
            String[] strings = line.split(" ");
            for (int i = strings.length - 1; i >= 0; i--) {
                int val = Integer.parseInt(strings[i]);
                stack1.push(val);
            }
            backtracking("");
            Collections.sort(list);
            for (String string : list) {
                System.out.println(string);
            }
        }
    }

    private static void backtracking(String string) {
        if (stack1.size() == 0 && stack2.size() == 0) {
            list.add(string);
            return;
        }
        if (stack2.size() > 0) {
            int val = stack2.pop();
            backtracking(string + " " + val);
            stack2.push(val);
        }
        if (stack1.size() > 0) {
            int val = stack1.pop();
            stack2.push(val);
            backtracking(string);
            stack2.pop();
            stack1.push(val);
        }
    }

}
