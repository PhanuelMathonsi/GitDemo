package ClassAndObj;

public class Employee {

    private String empName;
    private double empSalary;
    private int empId;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Employee() {
        this.empName = "Intern";
        this.empSalary = 10000.00;
        this.empId = 1;
    }

    public Employee(String empName, double empSalary, int empId) {
        this.empName = empName;
        this.empSalary = empSalary;
        this.empId = empId;
    }

    public void displayEmployee() {
        System.out.println("\nEmployee name: " + this.empName);
        System.out.println("Employee salary: R " + this.empSalary);
        System.out.println("Employee Id: " + this.empId);
    }

    public static void main(String[] args) {
        // using display
        // Employee emp1 = new Employee("Phanuel", 560, 1);
        // emp1.displayEmployee();

        //using setters
        Employee emp2 = new Employee();
        emp2.setEmpName("Mathonsi");
        emp2.setEmpSalary(15000);
        emp2.setEmpId(2);
        emp2.displayEmployee();

    }

}
