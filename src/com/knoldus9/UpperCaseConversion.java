package com.knoldus9;

/* Write a program that declares a String variable named "message" and initializes it with the value of "Hello".
   Using the toUpperCase() method, convert this variable to uppercase and print the result. */

public class UpperCaseConversion {
    public static void main(String[] args) {
        String message="Hello";
        String result=message.toUpperCase();
        System.out.println(result);
    }
}
