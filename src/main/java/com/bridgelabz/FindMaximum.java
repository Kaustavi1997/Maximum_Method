package com.bridgelabz;

public class FindMaximum<T extends Comparable<T>>{
    T first,second,third;
    public FindMaximum(T first,T second,T third){
        this.first=first;
        this.second=second;
        this.third=third;
    }

    public T maximum(){
        return FindMaximum.maximumElement(first,second,third);
    }

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
