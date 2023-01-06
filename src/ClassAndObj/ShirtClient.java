package ClassAndObj;

public class ShirtClient {

    public static void main(String[] args) {

        Shirt shirt4 = new Shirt(1, 2, "Wool");

        System.out.println("\nCollar size is: " + shirt4.getCollarSize());

        System.out.println("Sleevelength is: " + shirt4.getSleeveLength());

        System.out.println("Material is: " + shirt4.getMaterial());
    }
}
