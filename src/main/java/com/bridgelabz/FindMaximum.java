package com.bridgelabz;
import java.util.Arrays;

public class FindMaximum<T extends Comparable<T>>{
    private final T[] arguments;
    public FindMaximum(T... arguments){
        this.arguments = arguments;
    }
    public T getMaximum(){
        return FindMaximum.getMaximum(arguments);
    }
    public static <T> T getMaximum(T... arguments) {
        T maximumValue;
        Arrays.sort(arguments);
        maximumValue = arguments[arguments.length-1];
        printMaximum(maximumValue);
        return maximumValue;
    }

    public static <T> void printMaximum(T maximumValue){
        System.out.println("Maximum value:"+maximumValue);
    }
}