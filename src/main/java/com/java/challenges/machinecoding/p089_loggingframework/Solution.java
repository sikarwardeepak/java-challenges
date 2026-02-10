package com.java.challenges.machinecoding.p089_loggingframework;

import java.util.*;

public class Solution {
    public enum Level { DEBUG, INFO, WARN, ERROR }
    private Level currentLevel;
    private final List<String> logs;

    public Solution(Level level) { this.currentLevel = level; this.logs = new ArrayList<>(); }
    public void log(Level level, String message) {
        if (level.ordinal() >= currentLevel.ordinal()) logs.add("[" + level + "] " + message);
    }
    public List<String> getLogs() { return Collections.unmodifiableList(logs); }
    public void setLevel(Level level) { this.currentLevel = level; }
}