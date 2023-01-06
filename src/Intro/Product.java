package Intro;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1, num2, product;

        System.out.print("Enter the first Integer: \t");

        num1 = in.nextInt();

        System.out.print("Enter the first Integer: \t");

        num2 = in.nextInt();

        product = num1 * num2;

        System.out.println("The product of the two integers is: "+product);
    }
}
