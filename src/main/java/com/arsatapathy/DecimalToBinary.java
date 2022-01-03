package com.arsatapathy;

public class DecimalToBinary {

    public static String toBinary(int input, String result) {
        if (input == 0) return result;

        result = input % 2 + result;

        return toBinary(input / 2, result);
    }
}
