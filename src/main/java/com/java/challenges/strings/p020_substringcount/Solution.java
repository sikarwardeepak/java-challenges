package com.java.challenges.strings.p020_substringcount;

public class Solution {
    public int countSubstring(String str, String sub) {
        if (str == null || sub == null || sub.isEmpty()) return 0;
        int count = 0, idx = 0;
        while ((idx = str.indexOf(sub, idx)) != -1) {
            count++;
            idx += sub.length();
        }
        return count;
    }
}