package ch2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the numbe of bagels: \t");
        int numberOfBagels = in.nextInt();
        double cost;

        if (numberOfBagels < 6) {
            cost = numberOfBagels * 0.75;
            System.out.println("The total cost =R " + cost);
        } else if(numberOfBagels>=6){
            cost = numberOfBagels * 0.60;
            System.out.println("The total cost =R " + cost);
        }
    }
}
