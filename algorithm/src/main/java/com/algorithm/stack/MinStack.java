package com.algorithm.stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 最小栈实现
 */
public class MinStack {

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(5);
        stack.push(38);
        stack.push(10);
        stack.push(2);
        stack.push(6);
        stack.push(1);
        Integer min = stack.min();
        System.out.println(min);
    }

    private final Deque<Integer> min = new LinkedList<>();
    private final Deque<Integer> stack = new LinkedList<>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public void push(int value) {
        stack.push(value);
        boolean bool = min.isEmpty() || value <= min.peek();
        if (bool) {
            min.push(value);
        }
    }

    public Integer pop() {
        boolean bool = stack.isEmpty();
        if (bool) return null;
        int t = stack.pop();
        if (min.peek() != null && min.peek() == t) {
            min.pop();
        }
        return t;
    }

    /**
     * return top
     */
    public Integer peek() {
        boolean bool = stack.isEmpty();
        if (bool) return null;
        return stack.peek();
    }

    /**
     * return min
     */
    public Integer min() {
        boolean bool = min.isEmpty();
        if (bool) return null;
        return min.peek();
    }

}