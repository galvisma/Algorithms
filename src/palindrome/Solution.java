package palindrome;

import java.util.Arrays;

public class Solution {
    public boolean isPalindrome(int x) {

        String number = String.valueOf(x);
        char[] digits = number.toCharArray();

        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i]);
        }

        // read and save array in inverse order.
        char[] inverse = new char[digits.length];
        int j = digits.length - 1;

        for (int i = 0; i < digits.length; i++) {
            inverse[i] = digits[j];
            j = j - 1;
            System.out.println(inverse[i]);
        }

        if (Arrays.equals(digits, inverse)) {
            return true;
        } else {
            return false;
        }
    }
}
