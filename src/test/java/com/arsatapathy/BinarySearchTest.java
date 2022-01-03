package com.arsatapathy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    public void test_01() {
        Assertions.assertEquals(1, BinarySearch.binarySearch(new int[]{0,1,2}, 1, 0, 2));
    }

    @Test
    public void test_02() {
        Assertions.assertEquals(2, BinarySearch.binarySearch(new int[]{0,1,2}, 2, 0, 2));
    }

    @Test
    public void test_03() {
        Assertions.assertEquals(-1, BinarySearch.binarySearch(new int[]{0,1,2}, 3, 0, 2));
    }
}
