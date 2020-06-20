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
    public Double maximumOfFloat(Double firstNumber, Double secondNumber, Double ThirdNumber) {
        Double maximum = firstNumber;
        if (secondNumber.compareTo(maximum) > 0) {
            maximum = secondNumber;
        }
        if (ThirdNumber.compareTo(maximum) > 0) {
            maximum = ThirdNumber;
        }
        return maximum;
    }
    public String maximumOfString(String firstString, String secondString, String ThirdString) {
        String maximum = firstString;
        if (secondString.compareTo(maximum) > 0) {
            maximum = secondString;
        }
        if (ThirdString.compareTo(maximum) > 0) {
            maximum = ThirdString;
        }
        return maximum;
    }
}
