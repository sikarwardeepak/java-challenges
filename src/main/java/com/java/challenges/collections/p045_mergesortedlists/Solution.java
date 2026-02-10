package com.java.challenges.collections.p045_mergesortedlists;

import java.util.*;

public class Solution {
    public List<Integer> mergeKLists(List<List<Integer>> lists) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (List<Integer> list : lists) minHeap.addAll(list);
        List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) result.add(minHeap.poll());
        return result;
    }
}