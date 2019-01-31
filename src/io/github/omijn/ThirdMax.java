// https://leetcode.com/problems/third-maximum-number/

package io.github.omijn;

import java.util.*;

class ThirdMax {
    public int thirdMax(int[] nums) {
        Set<Integer> uniq = new HashSet<>();
        for (int i: nums) {
            uniq.add(i);
        }

        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        maxheap.addAll(uniq);

        if (maxheap.size() < 3) {
            return maxheap.peek();
        }

        for (int i = 0; i < 2; i++) {
            maxheap.poll();
        }

        return maxheap.poll();

    }
}
