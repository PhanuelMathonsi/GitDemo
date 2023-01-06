package ch2;

import java.util.Scanner;

public class GrossPay {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double pay, hours, ratePerHour;

        System.out.print("Please enter the number of hours: \t");

        hours = in.nextDouble();

        System.out.print("Please enter the rate per hour: \t");

        ratePerHour = in.nextDouble();

        if (hours <= 40) {

            pay = (hours * ratePerHour);

            System.out.println("Pay = R " + pay);

        } else {

            pay = (40 * ratePerHour) + (1.5 * ratePerHour * (hours - 40));

            System.out.println("Pay = R " + pay);

        }

    }

}
