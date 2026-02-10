package com.java.challenges.machinecoding.p087_splitwise;

import java.util.*;

public class Solution {
    private final Map<String, Double> balances;

    public Solution() { balances = new HashMap<>(); }
    public void addExpense(String paidBy, List<String> splitAmong, double amount) {
        double share = amount / splitAmong.size();
        balances.put(paidBy, balances.getOrDefault(paidBy, 0.0) + amount - share);
        for (String person : splitAmong) {
            if (!person.equals(paidBy))
                balances.put(person, balances.getOrDefault(person, 0.0) - share);
        }
    }
    public double getBalance(String person) { return balances.getOrDefault(person, 0.0); }
}