package ch2;

public class IncrementsAndDecrements {
    public static void main(String[] args) {
        // post increament
        int a = 2;
        System.out.println("At start a = " + a);
        System.out.println("Post increament a = " + a++);
        System.out.println("After post increment a = " + a);

        // pre increament
        int b = 5;
        System.out.println("At start a = " + b);
        System.out.println("Post increbment b = " + ++b);
        System.out.println("After post increment b = " + b);
    }
}
