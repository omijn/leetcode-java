// https://leetcode.com/problems/top-k-frequent-elements/

package io.github.omijn;

import java.util.*;

public class TopKFrequent {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> topk = new ArrayList<>();
        Map<Integer, Integer> counts = new HashMap<>();

        for (int item: nums) {
            counts.put(item, counts.getOrDefault(item, 0) + 1);
        }

        PriorityQueue<Integer> maxheap = new PriorityQueue<>((x, y) -> counts.get(y) - counts.get(x));

        maxheap.addAll(counts.keySet());

        for (int i = 0; i < k; i++) {
            topk.add(maxheap.poll());
        }

        return topk;

    }
}
