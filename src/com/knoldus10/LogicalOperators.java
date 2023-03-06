package com.knoldus10;

/* Create a program that declares two boolean variables named "isCold" and "isRainy" and initializes them with the values true and false respectively.
   Using logical operators, print "Bring a jacket and an umbrella" if both variables are true, "Bring a jacket" if only isCold is true, and "Bring an umbrella" if only isRainy is true.
 */

public class LogicalOperators {
    public static void main(String[] args) {
        boolean isCold=true, isRainy=false;
        if(isCold==true && isRainy==true)
        {
            System.out.println("Bring a jacket and an umbrella");
        } else if (isCold==true && isRainy==false)
        {
            System.out.println("Bring a jacket");
        } else if (isRainy==true && isCold==false) {
            System.out.println("Bring an umbrella");
        }
    }
}
