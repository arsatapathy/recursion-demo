package com.arsatapathy;

public class ReverseString {

    public static String reverseString(String input) {
        if (input.isEmpty())
            return "";

        return reverseString(input.substring(1)) + input.charAt(0);
    }
}
