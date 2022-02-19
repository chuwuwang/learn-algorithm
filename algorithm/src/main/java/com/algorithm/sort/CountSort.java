package com.algorithm.sort;

/**
 * 计数排序
 * 计数排序是桶排序的一种特殊情况
 */
public class CountSort {

    public static void main(String[] args) {
        int[] array = { 4, 3, 6, 3, 5, 1, 10, 3, 5, 1, 6 };
        new CountSort().countSort(array);
        for (int val : array) {
            System.out.print(val + " ");
        }
    }

    public void countSort(int[] array) {
        int max = 0;
        int min = 0;
        // 找出数组中的最大最小值
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        int[] help = new int[max + 1];
        // 找出每个数字出现的次数
        for (int i = 0; i < array.length; i++) {
            int index = array[i];
            help[index] += 1;
        }
        int index = 0;
        for (int i = 0; i < help.length; i++) {
            int val = help[i];
            while (val > 0) {
                array[index++] = i;
                val--;
            }
        }
    }

}
