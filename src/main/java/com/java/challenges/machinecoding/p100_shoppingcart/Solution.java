package com.java.challenges.machinecoding.p100_shoppingcart;

import java.util.*;

public class Solution {
    private final Map<String, double[]> cart; // name -> [price, quantity]
    private double discount;

    public Solution() { cart = new LinkedHashMap<>(); discount = 0; }
    public void addItem(String name, double price, int qty) {
        if (cart.containsKey(name)) { cart.get(name)[1] += qty; }
        else { cart.put(name, new double[]{price, qty}); }
    }
    public boolean removeItem(String name) { return cart.remove(name) != null; }
    public void applyDiscount(double percent) { this.discount = percent; }
    public double getTotal() {
        double total = 0;
        for (double[] item : cart.values()) total += item[0] * item[1];
        return total * (1 - discount / 100);
    }
    public int getItemCount() { return cart.size(); }
}