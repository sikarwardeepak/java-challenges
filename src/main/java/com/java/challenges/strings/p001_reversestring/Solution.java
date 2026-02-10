package com.java.challenges.strings.p001_reversestring;

public class Solution {
    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }
}
