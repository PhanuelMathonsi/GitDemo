package ch2;

public class SwitchDemo {
    public static void main(String[] args) {

        int testMarks = 2;

        switch (testMarks) {

            case 1 -> System.out.println("You are a freshman student");

            case 2 -> System.out.println("You are a sophomore student");

            case 3 -> System.out.println("You are a junior student");

            case 4 -> System.out.println("You are a senior student");

            default -> System.out.println("Invalid Year");

        }
    }
}
