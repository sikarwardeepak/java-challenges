package com.java.challenges.machinecoding.p095_inventorymanagement;

import java.util.*;

public class Solution {
    private final Map<String, int[]> inventory; // name -> [quantity, price]

    public Solution() { inventory = new HashMap<>(); }
    public void addItem(String name, int quantity, int price) { inventory.put(name, new int[]{quantity, price}); }
    public boolean removeItem(String name) { return inventory.remove(name) != null; }
    public boolean updateQuantity(String name, int delta) {
        if (!inventory.containsKey(name)) return false;
        int[] item = inventory.get(name);
        item[0] += delta;
        if (item[0] < 0) item[0] = 0;
        return true;
    }
    public int getQuantity(String name) { return inventory.containsKey(name) ? inventory.get(name)[0] : -1; }
}