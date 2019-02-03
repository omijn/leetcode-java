package io.github.omijn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {

    @Test
    void lengthOfLongestSubstring() {
        assertEquals(2, LongestSubstring.lengthOfLongestSubstring("aab"));
        assertEquals(3, LongestSubstring.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, LongestSubstring.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, LongestSubstring.lengthOfLongestSubstring("pwwkew"));
        assertEquals(6, LongestSubstring.lengthOfLongestSubstring("abcdef"));
    }
}