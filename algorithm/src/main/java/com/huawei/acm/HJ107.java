package com.huawei.acm;

import java.util.Scanner;

/**
 * 求解立方根
 * <p>
 * 描述
 * 计算一个浮点数的立方根，不使用库函数。
 * 保留一位小数。
 * <p>
 * 数据范围：val ≤ 20
 * <p>
 * 输入描述：
 * 待求解参数，为double类型（一个实数）
 * <p>
 * 输出描述：
 * 输入参数的立方根。保留一位小数。
 */
public class HJ107 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while ( scanner.hasNext() ) {
            String value = scanner.nextLine();
            double input = Double.parseDouble(value);
            boolean flag = false;
            if (input < 0) {
                flag = true;
                input = -input;
            }
            double distance = input; // 误差或者增加的距离
            double index = 0;
            double last = 0;
            while (true) {
                last = index * index * index;
                if (last > input) {
                    index -= distance;
                    distance /= 10;
                }
                if (distance < 0.001) {
                    break;
                }
                index += distance;
            }
            double result = (int) (index + 0.05) * 10 / 10.0;
            if (flag) {
                result = 0 - result;
            }
            System.out.println(result);
        }
    }

}