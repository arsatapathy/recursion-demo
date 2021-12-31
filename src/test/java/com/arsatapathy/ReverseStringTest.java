package com.arsatapathy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

    @Test
    public void test_01() {
        Assertions.assertEquals("hsihsa", ReverseString.reverseString("ashish"));
    }
}
