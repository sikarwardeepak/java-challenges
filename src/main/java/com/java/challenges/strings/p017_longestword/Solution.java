package com.java.challenges.strings.p017_longestword;

public class Solution {
    public String longestWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) return "";
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        return longest;
    }
}