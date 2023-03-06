package com.knoldus7;

/*Write a program that declares two integer variables named "num1" and "num2" and initializes them with the values 10 and 5 respectively.
  Using arithmetic operators, calculate the sum, difference, product, and quotient of these two variables and print the results. */

public class ArithmeticOperators {
    public static void main(String[] args) {
        int num1=10, num2=5, sum, difference, product, quotient;
        sum=num1+num2;
        difference=num1-num2;
        product=num1*num2;
        quotient=num1/num2;
        System.out.println("Sum is : "+sum);
        System.out.println("Difference is : "+difference);
        System.out.println("Product is : "+product);
        System.out.println("Quotient is : "+quotient);
    }
}
