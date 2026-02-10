package com.java.challenges.collections.p054_removeallelement;

import java.util.*;

public class Solution {
    public int removeElement(List<Integer> nums, int val) {
        nums.removeAll(Collections.singleton(val));
        return nums.size();
    }
}