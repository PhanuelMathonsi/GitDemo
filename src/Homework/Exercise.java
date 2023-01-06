package Homework;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        double price, totalAmout = 0, results = 0;

        int productNumber, quantitySold;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Product Number\tAmount\n1.\t\t$2.98\n2.\t\t$4.5\n3.\t\t$9.98\n4.\t\t$4.49\n5.\t\t$6.87");

            System.out.print("Please enter product number (0 to terminate) \t");

            productNumber = in.nextInt();

            if (productNumber > 5) {
                quantitySold = 0;
            } else if (productNumber == 0) {
                quantitySold = 0;
            } else {
                System.out.print("Please the quantity \t");
                quantitySold = in.nextInt();
            }

            switch (productNumber) {

                case 1 -> {
                    price = 2.98;
                    totalAmout = quantitySold * price;
                    // System.out.println("Cost = $" +totalAmout);
                }

                case 2 -> {
                    price = 4.5;
                    totalAmout = quantitySold * price;
                    // System.out.println("Cost = $" +totalAmout);
                }

                case 3 -> {
                    price = 9.98;
                    totalAmout = quantitySold * price;
                    // System.out.println("Cost = $" +totalAmout);
                }
                case 4 -> {
                    price = 4.49;
                    totalAmout = quantitySold * price;
                    // System.out.println("Cost = $" +totalAmout);
                }

                case 5 -> {
                    price = 6.87;
                    totalAmout = quantitySold * price;
                    // System.out.println("Cost = $" +totalAmout);
                }
                default -> System.out.println("Please enter a valid product number\n");
            }

            results += totalAmout;

        } while (productNumber != 0);

        System.out.println("The final amount is = $" + results + "\n");
    }
}
