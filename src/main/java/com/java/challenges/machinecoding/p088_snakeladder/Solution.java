package com.java.challenges.machinecoding.p088_snakeladder;

import java.util.*;

public class Solution {
    public int minThrows(int boardSize, Map<Integer, Integer> snakesAndLadders) {
        boolean[] visited = new boolean[boardSize + 1];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{1, 0});
        visited[1] = true;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int pos = curr[0], moves = curr[1];
            if (pos == boardSize) return moves;
            for (int dice = 1; dice <= 6; dice++) {
                int next = pos + dice;
                if (next > boardSize) continue;
                if (snakesAndLadders.containsKey(next)) next = snakesAndLadders.get(next);
                if (!visited[next]) { visited[next] = true; queue.add(new int[]{next, moves + 1}); }
            }
        }
        return -1;
    }
}