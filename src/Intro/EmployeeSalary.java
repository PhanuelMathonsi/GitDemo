package Intro;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int rate, hours, salary;

        System.out.print("Please enter the rate of pay: \t");

        rate = in.nextInt();

        System.out.print("Please Enter hours worked \t");

        hours = in.nextInt();

        salary = rate*hours;

        System.out.println("The salary is:"+salary);
        
    }
}
