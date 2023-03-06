package com.knoldus8;
import java.lang.*;

/* Create a program that declares a double variable named "radius" and initializes it with the value of 3.
 Calculate the area and circumference of a circle with this radius using predefined mathematical constants and print the results.
 */

public class CircleAreaAndCircumference {
    public static void main(String[] args) {
        double radius=5;
        double circumference=2*Math.PI*radius;
        double area=Math.PI*radius*radius;
        System.out.println("Circumference of circle : "+circumference);
        System.out.println("Area of Circle : "+area);
    }
}
