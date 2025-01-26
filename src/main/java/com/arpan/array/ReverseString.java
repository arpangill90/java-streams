package com.arpan.array;

public class ReverseString {
    public static void main(String[] args) {
        String reversed = reverseString("phone");
        System.out.println(reversed);
    }

    private static String reverseString(String value) {
        int start = 0, end = value.length()-1;
        char[] charArray = value.toCharArray();
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        return new String(charArray);
    }
}
