package org.launchcode.java.studios;

import java.util.Scanner;
public class Area {
    public static double circleArea(double rad) {

        double area;
        double pi = 3.14;

        area = pi * (rad * rad);
        return area;
    }

    public static void main(String[] args) {

        Scanner round = new Scanner(System.in);

        System.out.println("What is the radius?: ");

        double rad = round.nextFloat();
        while (rad <= 0) {
            System.out.println("This is a negative number; please try again: ");
            rad = round.nextFloat();
        }
        double area = circleArea(rad);
        System.out.println("The area of the circle with " + rad + " is " + area);

        //if (rad < 0){
        //    System.out.println("This is a negative number; please try again");
        //    System.out.println("What is the radius?: ");
        //} else {
        //    double area = circleArea(rad);
        //    System.out.println("The area of the cirlce with " + rad + " is " + area);
        //}

    }
}
