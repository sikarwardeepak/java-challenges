package com.java.challenges.machinecoding.p085_elevatorsystem;

import java.util.TreeSet;

public class Solution {
    private int currentFloor;
    private final TreeSet<Integer> requests;

    public Solution() { this.currentFloor = 0; this.requests = new TreeSet<>(); }
    public void requestFloor(int floor) { requests.add(floor); }
    public int getCurrentFloor() { return currentFloor; }
    public int moveNext() {
        if (requests.isEmpty()) return currentFloor;
        int next = requests.first();
        requests.pollFirst();
        currentFloor = next;
        return currentFloor;
    }
    public int getPendingRequests() { return requests.size(); }
}