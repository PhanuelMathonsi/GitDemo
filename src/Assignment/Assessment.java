
package Assignment;

import java.util.Scanner;

public class Assessment {

    public static void main(String[] args) {

        // declaring variables
        String userInput, userCommand, space = " ", concatenatedWord;
        String[] splittedArr;
        int number;

        Scanner in = new Scanner(System.in);

        do {

            System.out.print("\nPlease enter your command(even, show, concat or quit to exit):\t");

            // taking user input
            userInput = in.nextLine();

            // splitting the input and assign the elements to splittedArr
            splittedArr = userInput.split(space);

            // taking element at index 0, assign it to userCommand and convert it to lowerCase
            userCommand = splittedArr[0].toLowerCase();

            switch (userCommand) {

                case "even" -> {
                    if (splittedArr.length == 2) {
                        try {
                            number = Integer.parseInt(splittedArr[1]);
                            if (number % 2 == 0) {
                                System.out.println("YES");
                            } else {
                                System.out.println("NO");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number of parameter");
                        }
                    } else {
                        System.out.println("Invalid number of parameters");
                    }
                }

                case "show" -> {
                    if (splittedArr.length == 2) {
                        System.out.println("Your word is: " + splittedArr[1]);
                    } else {
                        System.out.println("Invalid number of parameters");
                    }
                }

                case "concat" -> {
                    if (splittedArr.length == 3) {
                        concatenatedWord = splittedArr[1].concat(splittedArr[2]);
                        System.out.println("Concatinated word is: " + concatenatedWord);
                    } else {
                        System.out.println("Invalid number of parameters");
                    }
                }

                case "quit" -> {
                    userCommand = "quit";
                    System.out.println("exited the program...");
                }

                default -> System.out.println("Invalid command \nPlease try again.");
            }

        } while (!userCommand.equals("quit"));

    }
}
