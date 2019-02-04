// https://leetcode.com/problems/add-binary/

package io.github.omijn;

import java.util.Arrays;

public class AddBinaryStrings {
    public static String addBinary(String a, String b) {
        String longer = (a.length() >= b.length())? a : b;
        String shorter = (a == longer)? b : a;

        int longerLen = longer.length();
        int shorterLen = shorter.length();
        int lenDiff = longerLen - shorterLen;

        char[] sum = new char[longerLen + 1];
        Arrays.fill(sum, '0');
        int carry = 0;
        for (int i = longerLen - 1; i >= 0; i--) {

            int digit1 = longer.charAt(i) - '0';
            int digit2 = 0;
            if (i - lenDiff >= 0)
                digit2 = shorter.charAt(i - lenDiff) - '0';
            int base10Sum = digit1 + digit2 + carry;
            int base2Sum = base10Sum % 2;
            if (base10Sum >= 2)
                carry = 1;
            else
                carry = 0;

            sum[i + 1] = (base2Sum == 0)? '0' : '1';
        }
        if (carry == 1)
            sum[0] = '1';

        return String.valueOf(sum).replaceFirst("^0+(?!$)", "");
    }


}
