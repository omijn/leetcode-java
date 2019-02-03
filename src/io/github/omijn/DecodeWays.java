// https://leetcode.com/problems/decode-ways/

package io.github.omijn;

import java.util.Arrays;

public class DecodeWays {
    public static int numDecodings(String s) {
        int[] cache = new int[s.length() + 1];
        Arrays.fill(cache, -1);
        return numDecodings(s, 0, cache);
    }

    private static int numDecodings(String s, int startIndex, int[] cache) {
        if (startIndex == s.length()) return 1;
        if (startIndex > s.length()) return 0;
        if (s.charAt(startIndex) == '0') return 0;
        if (cache[startIndex] != -1) return cache[startIndex];

        cache[startIndex] = numDecodings(s, startIndex + 1, cache);

        if (startIndex + 2 <= s.length()) {
            int twoDigits = Integer.valueOf(s.substring(startIndex, startIndex + 2));
            if (twoDigits >= 10 && twoDigits <= 26)
                cache[startIndex] += numDecodings(s, startIndex + 2, cache);
        }

        return cache[startIndex];
    }
}
