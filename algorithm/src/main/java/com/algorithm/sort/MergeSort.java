package com.algorithm.sort;

/**
 * 归并排序
 * 时间复杂度为 O (N * LogN)
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] array = { 49, 38, 65, 97, 76, 13, 27, 50 };
        new MergeSort().mergeSort(array);
        for (int val : array) {
            System.out.print(val + " ");
        }
    }

    public void mergeSort(int[] array) {
        if (array == null || array.length <= 1) return;
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int left, int right) {
        if (left >= right) return;
        int mid = (right + left) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private void merge(int[] array, int left, int mid, int right) {
        int[] helper = new int[array.length];
        int l = left, r = mid + 1, k = left;
        while (l <= mid && r <= right) {
            boolean bool = array[l] <= array[r];
            if (bool) {
                helper[k++] = array[l++];
            } else {
                helper[k++] = array[r++];
            }
        }
        while (l <= mid) {
            helper[k++] = array[l++];
        }
        while (r <= right) {
            helper[k++] = array[r++];
        }
        for (int i = left; i <= right; i++) {
            array[i] = helper[i];
        }
    }

}