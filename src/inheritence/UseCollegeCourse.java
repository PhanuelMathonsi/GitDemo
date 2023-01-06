
package inheritence;

public class UseCollegeCourse {

    public static void main(String[] args) {
        CollegeCourse course1 = new CollegeCourse(5000, "Software Development");
        System.out.println("College course name: " + course1.getName());
        System.out.println("College course price: " + course1.getPrice());
        System.out.println("College course with VAT: " + course1.computedPrice());
        // Lab course
        Lab course2 = new Lab("Mathematics", 12000);
        System.out.println("\nLab name: " + course2.getName());
        System.out.println("Lab price: " + course2.getPrice());
        System.out.println("Lab price with VAT: " + course2.computePrice());
    }
}
