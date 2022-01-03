package com.arsatapathy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfNaturalNumbersTest {

    @Test
    public void test_01() {
        Assertions.assertEquals(6, SumOfNaturalNumbers.sumUpTo(3, 0));
    }

    @Test
    public void test_02() {
        Assertions.assertEquals(6, SumOfNaturalNumbers.sumUpTo(3));
    }
}
