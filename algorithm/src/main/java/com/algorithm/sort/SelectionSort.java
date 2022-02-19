package com.algorithm.sort;

/**
 * 选择排序
 *
 * 时间复杂度为 O(N2)
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 4, 9, 1 };
        new SelectionSort().selectionSort(array);
        for (int val : array) {
            System.out.print(val + " ");
        }
    }

    public void selectionSort(int[] array) {
        if (array == null || array.length <= 1) return;
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                boolean bool = array[j] < array[minIndex];
                if (bool) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
