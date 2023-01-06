package Intro;

public class Time {
    public static void main(String[] args) {

        int minutes = 197, hours, cMinutes;

        hours = (minutes / 60);

        cMinutes = (minutes % 60);

        System.out.println("197 minutes has " + hours + " hours and " + cMinutes + " minutes");
    }
}
