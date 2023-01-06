package Homework2;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class WritePractice {
    public static void main(String[] args) throws IOException{
        String fileName = "C:\\Users\\Phanuel.Mathonsi\\Temp\\practice.txt";

        FileWriter file = new FileWriter(fileName);

        PrintWriter printWriter = new PrintWriter(file);

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your name: \t");

        printWriter.println(in.nextLine());
        printWriter.close();
    }
}
