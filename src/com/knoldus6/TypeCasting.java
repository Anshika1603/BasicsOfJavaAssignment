package com.knoldus6;

/* Create a program that declares a double variable named "distance" and initializes it with the value of 5.
   Convert this variable to an integer using casting, and print the result.
 */

public class TypeCasting {
    public static void main(String[] args) {
        double distance=5;
        int castingToInt= (int) distance;
        System.out.println(castingToInt);
    }
}
