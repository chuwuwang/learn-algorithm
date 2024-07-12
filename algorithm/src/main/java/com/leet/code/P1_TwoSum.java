package com.leet.code;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。<p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。<p>
 * 你可以按任意顺序返回答案。<p>
 *
 * 示例 1：<p>
 * 输入：nums = [2,7,11,15], target = 9 <p>
 * 输出：[0,1] <p>
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。 <p>
 *
 * 示例 2：<p>
 * 输入：nums = [3,2,4], target = 6 <p>
 * 输出：[1,2] <p>
 *
 * 示例 3：<p>
 * 输入：nums = [3,3], target = 6 <p>
 * 输出：[0,1] <p>
 */
public class P1_TwoSum {

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remains = target - nums[i];
            boolean contains = map.containsKey(remains);
            if (contains) {
                Integer first = map.get(remains);
                return new int[] {i, first};
            }
            map.put(nums[i], i);
        }
        // return new int[] {};

        // 解法 2
        int[] index = new int[2];
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            boolean contains = hash.containsKey(first);
            if (contains) {
                index[0] = i;
                index[1] = hash.get(first);
                return index;
            }
            // 将数据存入 key为补数, value为下标
            hash.put(target - nums[i], i);
        }
        return index;
    }

}
