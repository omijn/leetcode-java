// https://leetcode.com/problems/first-missing-positive/

package io.github.omijn;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int item: nums) {
            set.add(item);
        }

        int i;
        for (i = 1; i <= Integer.MAX_VALUE; i++) {
            if (!set.contains(i)) {
                break;
            }
        }

        return i;
    }

}
