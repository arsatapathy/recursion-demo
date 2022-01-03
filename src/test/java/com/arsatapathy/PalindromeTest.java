package com.arsatapathy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void test_01() {
        Assertions.assertTrue(Palindrome.isPalindrome("racecar"));
    }


    @Test
    public void test_02() {
        Assertions.assertFalse(Palindrome.isPalindrome("carrace"));
    }
}
