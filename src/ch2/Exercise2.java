package ch2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the numbe of widgets: \t");

        int numberOfWidgets = in.nextInt();

        double cost =0;

        if (numberOfWidgets < 100) {

            cost = numberOfWidgets * 0.25;

            System.out.println("The total cost =R " + cost);

        } else {

            cost = numberOfWidgets * 0.20;

            System.out.println("The total cost =R " + cost);
        }
    }
}
