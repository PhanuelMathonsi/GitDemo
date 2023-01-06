package Homework;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {

		double price =0, totalAmout = 0, results = 0;

		int productNumber, quantitySold;

		Scanner in = new Scanner(System.in);

		System.out.println("Product Number\tAmount\n1.\t\t$2.98\n2.\t\t$4.5\n3.\t\t$9.98\n4.\t\t$4.49\n5.\t\t$6.87");

		System.out.print("Please enter product number (0 to terminate) \t");

		productNumber = in.nextInt();

		if (productNumber==0) {

			quantitySold = 0;

		} else if(productNumber > 5){

		quantitySold=0;

		}else{
				System.out.print("Please the quantity sold \t");

			quantitySold = in.nextInt();
		}

		while (productNumber != 0) {

			switch (productNumber) {

			case 1 -> price = 2.98;

			case 2 -> price = 4.5;

			case 3 -> price = 9.98;

			case 4 -> price = 4.49;

			case 5 -> price = 6.87;
			
			default -> System.out.println("Please enter a valid product number\n");
			}

			totalAmout = quantitySold *price;

			System.out.println("Cost = $" +totalAmout+"\n");

			results += totalAmout;

			System.out.println("Product Number\tAmount\n1.\t\t$2.98\n2.\t\t$4.5\n3.\t\t$9.98\n4.\t\t$4.49\n5.\t\t$6.87");

			System.out.print("Please enter product number (0 to terminate) \t");

			productNumber = in.nextInt();

			if (productNumber == 0) {
				continue;

			} else if (productNumber > 5) {
				quantitySold = 0;
			} else {
				System.out.print("Please the quantity sold \t");
				quantitySold = in.nextInt();
			}
		}

		System.out.println("The final amount is = $" + results + "\n");

	}
}
