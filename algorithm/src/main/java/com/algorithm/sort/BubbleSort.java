package com.algorithm.sort;

/**
 * 冒泡排序
 *
 * 时间复杂度为 O(N * N)
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = { 49, 38, 65, 97, 76, 13, 27, 50 };
        new BubbleSort().bubbleSort(array);
        for (int val : array) {
            System.out.print(val + " ");
        }
    }

    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}