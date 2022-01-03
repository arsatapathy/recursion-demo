package com.arsatapathy;

public class BinarySearch {

    public static int binarySearch(int[] input, int find, int left, int right) {
        if (left > right) return -1;

        int mid = (left + right) / 2;

        if (input[mid] == find) return mid;

        if (input[mid] > find)
            return binarySearch(input, find, left, mid -1);
        else
            return binarySearch(input, find, mid + 1, right);

    }
}
