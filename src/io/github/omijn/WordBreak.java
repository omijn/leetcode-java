// https://leetcode.com/problems/word-break/
package io.github.omijn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        int strlen = s.length();
        boolean[] cache = new boolean[strlen + 1];
        cache[0] = true;

        for (int i = 1; i <= strlen; i++) {
            for (int j = 0; j < i; j++) {
                if (cache[j] && dict.contains(s.substring(j, i))) {
                    cache[i] = true;
                    break;  // don't care whether there are multiple possible segmentations at a particular place in the string, just that one exists
                }
            }
        }

        return cache[strlen];
    }
}
