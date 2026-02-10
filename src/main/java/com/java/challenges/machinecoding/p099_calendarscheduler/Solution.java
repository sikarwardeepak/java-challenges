package com.java.challenges.machinecoding.p099_calendarscheduler;

import java.util.*;

public class Solution {
    private final List<int[]> meetings; // [start, end]

    public Solution() { meetings = new ArrayList<>(); }
    public boolean bookMeeting(int start, int end) {
        for (int[] m : meetings) {
            if (start < m[1] && end > m[0]) return false; // overlap
        }
        meetings.add(new int[]{start, end});
        return true;
    }
    public boolean isAvailable(int start, int end) {
        for (int[] m : meetings) {
            if (start < m[1] && end > m[0]) return false;
        }
        return true;
    }
}