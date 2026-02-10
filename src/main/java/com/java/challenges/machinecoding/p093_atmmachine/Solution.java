package com.java.challenges.machinecoding.p093_atmmachine;

import java.util.*;

public class Solution {
    private final Map<String, double[]> accounts; // accountId -> [balance, pin]

    public Solution() { accounts = new HashMap<>(); }
    public void createAccount(String id, double balance, int pin) { accounts.put(id, new double[]{balance, pin}); }
    public double checkBalance(String id, int pin) {
        if (!authenticate(id, pin)) return -1;
        return accounts.get(id)[0];
    }
    public boolean deposit(String id, int pin, double amount) {
        if (!authenticate(id, pin) || amount <= 0) return false;
        accounts.get(id)[0] += amount;
        return true;
    }
    public boolean withdraw(String id, int pin, double amount) {
        if (!authenticate(id, pin) || amount <= 0 || accounts.get(id)[0] < amount) return false;
        accounts.get(id)[0] -= amount;
        return true;
    }
    private boolean authenticate(String id, int pin) {
        return accounts.containsKey(id) && accounts.get(id)[1] == pin;
    }
}