package com.java.challenges.collections.p050_queueusingstacks;

import java.util.Stack;

public class Solution {
    private Stack<Integer> input = new Stack<>();
    private Stack<Integer> output = new Stack<>();

    public void push(int x) { input.push(x); }
    public int pop() { peek(); return output.pop(); }
    public int peek() {
        if (output.isEmpty()) { while (!input.isEmpty()) output.push(input.pop()); }
        return output.peek();
    }
    public boolean isEmpty() { return input.isEmpty() && output.isEmpty(); }
}