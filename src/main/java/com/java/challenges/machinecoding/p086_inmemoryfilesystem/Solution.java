package com.java.challenges.machinecoding.p086_inmemoryfilesystem;

import java.util.*;

public class Solution {
    private final Map<String, String> files;
    private final Set<String> dirs;

    public Solution() { files = new HashMap<>(); dirs = new HashSet<>(); dirs.add("/"); }
    public void mkdir(String path) { dirs.add(path); }
    public void addFile(String path, String content) { files.put(path, content); }
    public String readFile(String path) { return files.getOrDefault(path, null); }
    public List<String> ls(String path) {
        List<String> result = new ArrayList<>();
        if (files.containsKey(path)) { result.add(path.substring(path.lastIndexOf('/') + 1)); return result; }
        for (String d : dirs) { if (d.startsWith(path) && !d.equals(path)) result.add(d); }
        for (String f : files.keySet()) { if (f.startsWith(path)) result.add(f); }
        return result;
    }
}