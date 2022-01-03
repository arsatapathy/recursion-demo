package com.arsatapathy;

public class SumOfNaturalNumbers {

    public static int sumUpTo(int number, int result) {
        if (number == 0) return result;

        result += number;

        return sumUpTo(number - 1, result);
    }

    public static int sumUpTo(int number) {
        if (number == 0) return 0;

        number += sumUpTo(number - 1);

        return number;
    }
}
