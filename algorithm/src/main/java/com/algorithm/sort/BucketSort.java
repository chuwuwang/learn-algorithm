package com.algorithm.sort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 桶排序
 * 时间复杂度为 O（N）
 */
public class BucketSort {

    public static void main(String[] args) {
        int[] array = { 49, 38, 65, 97, 76, 13, 27, 50 };
        new BucketSort().bucketSort(array);
    }

    public void bucketSort(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        // 桶数
        // int bucketNum = array.length;
        int bucketNum = (max - min) / array.length + 1;
        // 初始化桶
        ArrayList<ArrayList<Integer>> bucket = new ArrayList<>(bucketNum);
        for (int i = 0; i < bucketNum; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            bucket.add(list);
        }
        // 将每个元素放入桶
        for (int i = 0; i < array.length; i++) {
            int num = (array[i] - min) / array.length;
            bucket.get(num).add(array[i]);
        }
        // 对每个桶进行排序
        for (int i = 0; i < bucket.size(); i++) {
            ArrayList<Integer> value = bucket.get(i);
            Collections.sort(value);
        }
        System.out.println(bucket);
    }

}
