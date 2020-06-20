package com.bridgelabz;

public class FindMaximum {
    public static <T extends Comparable<T>> T maximumElement(T first,T second,T third) {
        T maximum = first;
        if (second.compareTo(maximum) > 0) {
            maximum = second;
        }
        if (third.compareTo(maximum) > 0) {
            maximum = third;
        }
        return maximum;
    }
}
