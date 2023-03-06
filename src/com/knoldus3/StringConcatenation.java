package com.knoldus3;

/*Write a program that declares a String variable named "name" and assigns it a value of "John".
Concatenate this variable with another String variable named "message" and print the result. */

public class StringConcatenation {
    public static void main(String[] args) {
        String name="John", message="How are you?";
        String result=name+" "+message;
        System.out.println(result);
    }
}
