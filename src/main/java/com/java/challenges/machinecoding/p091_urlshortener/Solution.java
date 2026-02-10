package com.java.challenges.machinecoding.p091_urlshortener;

import java.util.*;

public class Solution {
    private final Map<String, String> shortToLong;
    private final Map<String, String> longToShort;
    private int counter;

    public Solution() { shortToLong = new HashMap<>(); longToShort = new HashMap<>(); counter = 0; }
    public String shorten(String longUrl) {
        if (longToShort.containsKey(longUrl)) return longToShort.get(longUrl);
        String shortUrl = "http://short.url/" + Integer.toString(counter++, 36);
        shortToLong.put(shortUrl, longUrl);
        longToShort.put(longUrl, shortUrl);
        return shortUrl;
    }
    public String resolve(String shortUrl) { return shortToLong.getOrDefault(shortUrl, null); }
}