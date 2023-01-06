package ch9;

public class UseMinimum {
    public static void main(String[] args) {

        int result;
        
        result = Minimum.findMin(6, 1, 3);
        
        System.out.println("Minimum is:" + result);
        
        result = Minimum.findMin(6, 1, 3);
        
        System.out.println("Minimum is:" + result);

        Minimum.displayAge(15);
        
    }

}
