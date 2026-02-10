package com.java.challenges.strings.p003_anagramcheck;

import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) return false;
        char[] a = s.toCharArray(), b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}