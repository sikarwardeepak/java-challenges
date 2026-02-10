package com.java.challenges.collections.p057_designhashset;

public class Solution {
    private boolean[] set;
    public Solution() { set = new boolean[1000001]; }
    public void add(int key) { set[key] = true; }
    public void remove(int key) { set[key] = false; }
    public boolean contains(int key) { return set[key]; }
}