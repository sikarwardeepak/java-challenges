package com.java.challenges.machinecoding.p092_librarymanagement;

import java.util.*;

public class Solution {
    private final Map<String, Integer> books; // title -> available copies

    public Solution() { books = new HashMap<>(); }
    public void addBook(String title, int copies) { books.put(title, books.getOrDefault(title, 0) + copies); }
    public boolean borrowBook(String title) {
        int available = books.getOrDefault(title, 0);
        if (available <= 0) return false;
        books.put(title, available - 1);
        return true;
    }
    public void returnBook(String title) { books.put(title, books.getOrDefault(title, 0) + 1); }
    public List<String> searchBook(String keyword) {
        List<String> result = new ArrayList<>();
        for (String title : books.keySet()) { if (title.toLowerCase().contains(keyword.toLowerCase())) result.add(title); }
        return result;
    }
}