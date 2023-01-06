package Homework;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int traveledMiles, gallonsUsed;

		float totalMilesPerGallon = 0.0f, tripMilesPerGallon;

		do {

			System.out.print("Please enter gallons used (0 to terminate): \t");

			gallonsUsed = in.nextInt();

			if (gallonsUsed == 0) {
				//
			} else {

				System.out.print("Please enter trip miles:\t");

				traveledMiles = in.nextInt();

                if(traveledMiles<=0){

                    System.out.println("Please enter valid miles");

                }else{

                    tripMilesPerGallon = (float)traveledMiles / gallonsUsed;
    
                    System.out.println("Miles per gallon = " + tripMilesPerGallon);
    
                    totalMilesPerGallon += tripMilesPerGallon;

                }

			}

		} while (gallonsUsed != 0);

		System.out.println("Combined miles per gallon = " + totalMilesPerGallon);

	}
}