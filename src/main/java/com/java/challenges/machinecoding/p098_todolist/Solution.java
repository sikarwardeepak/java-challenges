package com.java.challenges.machinecoding.p098_todolist;

import java.util.*;

public class Solution {
    private final Map<Integer, String[]> tasks; // id -> [title, status]
    private int nextId;

    public Solution() { tasks = new LinkedHashMap<>(); nextId = 0; }
    public int addTask(String title) { int id = ++nextId; tasks.put(id, new String[]{title, "PENDING"}); return id; }
    public boolean completeTask(int id) {
        if (!tasks.containsKey(id)) return false;
        tasks.get(id)[1] = "COMPLETED";
        return true;
    }
    public boolean deleteTask(int id) { return tasks.remove(id) != null; }
    public List<String> listPendingTasks() {
        List<String> result = new ArrayList<>();
        for (String[] task : tasks.values()) { if ("PENDING".equals(task[1])) result.add(task[0]); }
        return result;
    }
}