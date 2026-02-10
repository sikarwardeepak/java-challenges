package com.java.challenges.strings.p014_stringrotation;

public class Solution {
    public boolean isRotation(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) return false;
        String doubled = s1 + s1;
        return doubled.contains(s2);
    }
}