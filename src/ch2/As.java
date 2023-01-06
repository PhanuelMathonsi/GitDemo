package ch2;

import java.util.Scanner;

/**
 *
 * @author Sithembiso.Malinga
 */
public class As {

    public static void main(String[] args) {
        String cmd;
        String[] cmdArr;
        int number;
        String delimeter = " ";

        Scanner input = new Scanner(System.in);

        System.out.println("CMD: Please enter (even, show, concat) to compute, (or Quit to exit): ");
        cmd = input.nextLine();
        cmdArr = cmd.split(delimeter);

        while (!(cmdArr[0].equalsIgnoreCase("quit"))) {

            switch (cmdArr[0].toLowerCase()) {

                case "even":
                    try {
                        int num1 = Integer.parseInt(cmdArr[1]);
                        if (num1 % 2 == 0) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("invalid input");
                    }
                    break;

                case "show":
                    if (cmdArr[0].equalsIgnoreCase("show")) {
                        System.out.println("Your word is: " + cmdArr[1]);
                    } else {
                        System.out.println("Invalid input");
                    }
                    break;

                case "concat":
                    if (cmdArr.length != 3) {
                        System.out.println("Invalid input");
                    } else {
                        if (cmdArr[0].equalsIgnoreCase("concat")) {
                            System.out.println(cmdArr[1] + cmdArr[2]);
                        } else {
                            System.out.println("Invalid input");
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid command");

            }

            System.out.println("CMD: Please enter (even, show, concat) to compute, (or Quit to exit): ");
            cmd = input.nextLine();
            cmdArr = cmd.split(delimeter);

        }

    }
}