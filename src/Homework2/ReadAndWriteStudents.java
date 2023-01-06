package Homework2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAndWriteStudents {
    public static void main(String[] args) throws IOException {

        String studentName, currentLine, terminate = "exit";

        String studentList = "C:\\Users\\Phanuel.Mathonsi\\Temp\\Students.txt";

        // For reading the file
        File studentFile = new File(studentList);

        Scanner sc = new Scanner(studentFile);

        // For writting in the file
        FileWriter file = new FileWriter(studentList);

        do {

            Scanner in = new Scanner(System.in);

            System.out.print("Please enter student name(or type exit to terminate): \t");

            studentName = in.nextLine();

            studentName.trim();

            PrintWriter printWriter = new PrintWriter(file);

            if (studentName.equalsIgnoreCase(terminate)) {

                System.out.println("Program terminated...\n");
                printWriter.close();

            } else {

                printWriter.println(studentName);

            }

        } while (!studentName.equalsIgnoreCase(terminate));
        
        int i = 1;
        while (sc.hasNextLine()) {

            currentLine = sc.nextLine();

            System.out.println(i + "." + currentLine);
            ++i;
        }

    }
}
