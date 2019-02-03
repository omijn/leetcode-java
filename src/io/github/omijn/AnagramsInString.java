// https://leetcode.com/problems/find-all-anagrams-in-a-string/

package io.github.omijn;

import java.util.*;

public class AnagramsInString {
    public static List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> lettersInP = new HashMap<>();
        List<Integer> indices = new ArrayList<>();
        int strLen = s.length();
        int anagramLen = p.length();

        for (char c: p.toCharArray())
            lettersInP.put(c, lettersInP.getOrDefault(c, 0) + 1);

        for (int i = 0; i <= strLen - anagramLen; i++) {
            if (!lettersInP.containsKey(s.charAt(i)))
                continue;

            if (isAnagram(s.substring(i, i + anagramLen), lettersInP))
                indices.add(i);
        }

        return indices;
    }

    private static boolean isAnagram(String substring, Map<Character, Integer> lettersInString) {
        Map<Character, Integer> lettersInSubstring = new HashMap<>();
        for (char c: substring.toCharArray())
            lettersInSubstring.put(c, lettersInSubstring.getOrDefault(c, 0) + 1);

        return lettersInString.equals(lettersInSubstring);
    }
}
