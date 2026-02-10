package com.java.challenges.collections.p049_stackusingqueues;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) q2.add(q1.poll());
        Queue<Integer> temp = q1; q1 = q2; q2 = temp;
    }
    public int pop() { return q1.poll(); }
    public int top() { return q1.peek(); }
    public boolean isEmpty() { return q1.isEmpty(); }
}