// https://leetcode.com/problems/longest-substring-without-repeating-characters/

package io.github.omijn;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int strlen = s.length();
        char[] C = s.toCharArray();
        int i = 0;
        int longestSubstrLen = 0;

        while (i < strlen) {
            Set<Character> seenChars = new HashSet<>();
            int j = i;
            int substrLen = 0;

            while (j < strlen && !seenChars.contains(C[j])) {
                seenChars.add(C[j]);
                substrLen += 1;
                j++;
            }

            if (substrLen > longestSubstrLen)
                longestSubstrLen = substrLen;

            i = j;
        }

        return longestSubstrLen;
    }
}
