package ch9;

public class Minimum {

    public static int findMin(int a, int b, int c) {

        int min;
        
        min = (a < b) ? a : b;
        
        return (min < c) ? min : c;
    }
    public static double findMin(double a, double b, double c) {

        double min;
        
        min = (a < b) ? a : b;
        
        return (min < c) ? min : c;
    }

    public static void displayAge(int age){

        System.out.println("Your age is : " + age);
    }
}
