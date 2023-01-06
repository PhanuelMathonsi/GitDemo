package exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {
        //mistakeTwo();
        try {
            //code that might fail
            int i = 5, j =0;
            int k=i/j;
        } catch (ArithmeticException e) {
            // What to do 
            System.out.println("Error found");
            System.out.println("Error found is : "+ e.getMessage());
        }
        System.out.println("Execution continues");
    }

    public static void mistakeOne(){

        int i = 5, j =0;

    }

    public static void mistakeTwo() {
        String name[]= new String[3];
        name[0]="Thabo";
        name[2]="Shevensho";
        name[3]="Asifa";

        for(int i=0;i<=3;i++){
            System.out.println(i+ " "+name[i]);
        }
    }
}
