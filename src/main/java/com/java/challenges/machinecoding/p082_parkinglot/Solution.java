package com.java.challenges.machinecoding.p082_parkinglot;

import java.util.*;

public class Solution {
    private final int capacity;
    private final Map<Integer, String> slots;
    private final Queue<Integer> available;

    public Solution(int capacity) {
        this.capacity = capacity;
        this.slots = new HashMap<>();
        this.available = new LinkedList<>();
        for (int i = 1; i <= capacity; i++) available.add(i);
    }
    public int park(String vehicleId) {
        if (available.isEmpty()) return -1;
        int slot = available.poll();
        slots.put(slot, vehicleId);
        return slot;
    }
    public boolean leave(int slotNumber) {
        if (!slots.containsKey(slotNumber)) return false;
        slots.remove(slotNumber);
        available.add(slotNumber);
        return true;
    }
    public int getAvailableSlots() { return available.size(); }
}