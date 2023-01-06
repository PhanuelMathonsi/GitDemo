package ReadAndWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("C:\\Users\\Phanuel.Mathonsi\\Temp\\notes.txt");

        Scanner sc = new Scanner(file);

        String currentLine;

        while(sc.hasNextLine()){

            currentLine = sc.nextLine();

            System.out.println(currentLine);
        }
    }
}
