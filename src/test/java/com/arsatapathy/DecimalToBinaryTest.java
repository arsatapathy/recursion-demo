package com.arsatapathy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecimalToBinaryTest {

    @Test
    public void test_01() {
        Assertions.assertEquals(DecimalToBinary.toBinary(10, ""), "1010");
    }
}
