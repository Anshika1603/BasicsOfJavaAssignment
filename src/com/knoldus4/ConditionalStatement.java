package com.knoldus4;

/* Create a program that declares a boolean variable named "isRaining" and assigns it a value of true.
   Using an if statement, print "Take an umbrella" if isRaining is true, and "Enjoy the sunshine" otherwise. */

public class ConditionalStatement {
    public static void main(String[] args) {
        boolean isRaining=true;
        if(isRaining==true)
        {
            System.out.println("Take an Umbrella");
        }
        else
        {
            System.out.println("Enjoy the Sunshine");
        }
    }
}
