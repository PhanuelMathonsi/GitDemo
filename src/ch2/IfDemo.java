package ch2;

public class IfDemo {
    public static void main(String[] args) {

        int a = 5, b = 6;

        String result = (a == b) ? "Equals" : "not equal";

        System.out.println(result);

        int reuslts = 66;
    
        if(reuslts<65)
        {
            System.out.println("Fail");
        }else if(reuslts>=65)
        {
            System.out.println("Pass");
        }else if(reuslts>=80 && reuslts<=100)
        {
            System.out.println("Pass Distinction");
        } else{
            System.out.println("Invalid results");
        }
    }

}
