package com.java.challenges.machinecoding.p090_taskmanager;

import java.util.*;

public class Solution {
    private final PriorityQueue<int[]> tasks; // [priority, id]
    private int nextId;

    public Solution() { tasks = new PriorityQueue<>((a, b) -> b[0] - a[0]); nextId = 0; }
    public int addTask(String name, int priority) { int id = ++nextId; tasks.add(new int[]{priority, id}); return id; }
    public int[] getNextTask() { return tasks.isEmpty() ? null : tasks.peek(); }
    public int[] completeNextTask() { return tasks.isEmpty() ? null : tasks.poll(); }
    public int getPendingCount() { return tasks.size(); }
}