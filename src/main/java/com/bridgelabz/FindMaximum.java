package com.bridgelabz;

public class FindMaximum {
    public Integer maximum(Integer firstNumber, Integer secondNumber, Integer ThirdNumber) {
        Integer maximum = firstNumber;
        if (secondNumber.compareTo(maximum) > 0) {
            maximum = secondNumber;
        }
        if (ThirdNumber.compareTo(maximum) > 0) {
            maximum = ThirdNumber;
        }
        return maximum;
    }
}
