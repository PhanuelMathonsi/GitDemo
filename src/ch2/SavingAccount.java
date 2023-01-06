package ch2;

import java.util.Scanner;

public class SavingAccount {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double currentBalance, withdrawalAmount, newBalance;

        System.out.print("Please enter the current balance: \t");

        currentBalance = in.nextDouble();

        System.out.print("Please enter the withdrawal amount: \t");

        withdrawalAmount = in.nextDouble();

        if (currentBalance < withdrawalAmount) {

            System.out.println("Withdrawal denied");

        } else {

            newBalance = currentBalance - withdrawalAmount;

            if (newBalance < 150) {

                System.out.println("Balance below R150");

                System.out.println("Balance = R" + newBalance);

            } else {

                System.out.println("Balance = R" + newBalance);

            }
        }
    }
}
