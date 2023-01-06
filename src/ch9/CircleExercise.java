package ch9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleExercise {

    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);

            System.out.print("Please enter the radius of the circle to get the area:\t");

            double radius = in.nextDouble();

            double area = circleArea(radius);

            System.out.println("The area of a circle is = " + area);

        } catch (InputMismatchException e) {

            System.out.println("Make sure you enter a valid input");

        } finally{
            //this will always get exercised
            System.out.println("in finally block");
            System.out.println("Tidy up here");
        }

    }

    public static double circleArea(double r) {

        return Math.PI * (r * r);
    
    }

}
