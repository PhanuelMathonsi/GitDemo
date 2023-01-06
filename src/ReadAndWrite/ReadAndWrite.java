package ReadAndWrite;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadAndWrite {
    public static void main(String[] args) throws IOException{
        
        String fileName = "C:\\Users\\Phanuel.Mathonsi\\Temp\\notes.txt";

        FileWriter file = new FileWriter(fileName);

        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("This is line1");
        printWriter.println("This is line2");
        printWriter.println("I Added this line");
        printWriter.println("This is the last line");
        printWriter.close();
    }
}
