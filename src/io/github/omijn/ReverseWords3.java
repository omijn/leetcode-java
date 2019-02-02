//https://leetcode.com/problems/reverse-words-in-a-string-iii/

package io.github.omijn;

public class ReverseWords3 {
    public static String reverseWords(String s) {
        char[] C = s.toCharArray();
        int len = C.length;
        for (int i = 0; i < len; i++) {
            if (C[i] == ' ')
                continue;

            int wordBeginning = i;
            int wordEnding = i;
            while (wordEnding + 1 < len && C[wordEnding + 1] != ' ') {
                wordEnding++;
            }
            strrev(C, wordBeginning, wordEnding);
            i = wordEnding + 1;
        }

        return String.valueOf(C);
    }

    private static void strrev(char[] array, int start, int end) {
        for (int i = 0; i <= (end - start) / 2; i++) {
            char temp = array[start + i];
            array[start + i] = array[end - i];
            array[end - i] = temp;
        }
    }
}
