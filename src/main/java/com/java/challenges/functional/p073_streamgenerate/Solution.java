package com.java.challenges.functional.p073_streamgenerate;

import java.util.*;
import java.util.stream.*;

public class Solution {
    public List<Long> fibonacci(int n) {
        return Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
            .limit(n)
            .map(f -> f[0])
            .collect(Collectors.toList());
    }
}