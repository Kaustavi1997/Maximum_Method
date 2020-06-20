package com.bridgelabz;
import java.util.Arrays;

public class FindMaximum<T extends Comparable<T>>{
    T[] arr;
    public FindMaximum(T[] arr){
        this.arr = arr;
    }
    public T getMaximum() {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public void printMaximum(){
        System.out.println(arr[arr.length-1]);
    }
}
