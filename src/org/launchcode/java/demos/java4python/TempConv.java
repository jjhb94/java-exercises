package org.launchcode.java.demos.java4python;

import java.util.Scanner;

/**
 * From "Java for Python Programmers"
 */
public class TempConv {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        Scanner in; // here we declare "in" to be a Scanner ( this is to read data later used for input )

        in = new Scanner(System.in); // this is a Scanner instance using the word "new" then then calling the constructor and passing in the System.in ( means input )
        System.out.println("Enter the temperature in F: ");
        fahrenheit = in.nextDouble();

        celsius = (fahrenheit - 32) * 5.0/9.0;
        System.out.println("The temperature in C is: " + celsius);
    }

}
