package com.leet.code;

/**
 * 3. 无重复字符的最长子串 <p>
 *
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串的长度。<p>
 *
 * 示例 1: <p>
 * 输入: s = "abcabcbb" <p>
 * 输出: 3  <p>
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。 <p>
 *
 * 示例 2: <p>
 * 输入: s = "bbbbb" <p>
 * 输出: 1 <p>
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。<p>
 *
 * 示例 3: <p>
 * 输入: s = "pwwkew" <p>
 * 输出: 3 <p>
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。<p>
 */
public class P3_LengthOfLongestSubstring {

    public static void main(String[] args) {

    }


    public int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for (int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int length = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置
        for (int i = 0; i < length; i++) {
            int index = s.charAt(i); // 获取字符对应的 ASCII
            start = Math.max(start, last[index] + 1);  // 因为last[index]代表上一次出现的位置，但是字符串内字符不能重复，所以要从上一次出现位置的下一个位置开始
            res = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }

}
