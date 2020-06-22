package com.bridgelabz;
import java.util.Arrays;

public class FindMaximum<T extends Comparable<T>>{
    public static <T> T getMaximum(T... arguments) {
        Arrays.sort(arguments);
        T maximumValue = arguments[arguments.length-1];
        printMaximum(maximumValue);
        return maximumValue;
    }
    public static <T> void printMaximum(T maximumValue){
        System.out.println("Maximum value:"+maximumValue);
    }
}