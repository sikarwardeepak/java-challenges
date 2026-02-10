package com.java.challenges.machinecoding.p084_vendingmachine;

import java.util.*;

public class Solution {
    private double balance;
    private final Map<String, double[]> products; // [price, quantity]

    public Solution() { this.balance = 0; this.products = new HashMap<>(); }
    public void addProduct(String name, double price, int qty) { products.put(name, new double[]{price, qty}); }
    public void insertCoin(double amount) { balance += amount; }
    public boolean selectProduct(String name) {
        if (!products.containsKey(name)) return false;
        double[] info = products.get(name);
        if (info[1] <= 0 || balance < info[0]) return false;
        balance -= info[0];
        info[1]--;
        return true;
    }
    public double getBalance() { return balance; }
}