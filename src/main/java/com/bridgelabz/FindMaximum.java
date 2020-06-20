package com.bridgelabz;
import java.util.Arrays;

public class FindMaximum{
    public static <T extends Comparable<T>> T getMaximum(T[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
