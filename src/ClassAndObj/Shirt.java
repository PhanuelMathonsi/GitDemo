package ClassAndObj;

public class Shirt {

    // instance variables - state of the objects
    private int collarSize;

    private int sleeveLength;

    private String material;

    // default constructor. Used to initialise instance variables
    public Shirt() {

        this.collarSize = 99;

        this.sleeveLength = 999;

        this.material = "Unknown";

    }

    // Overloading constructor
    public Shirt(int cs, int sl, String mat) {

        this.collarSize = cs;

        this.sleeveLength = sl;

        this.material = mat;

    }

    // methods - behavior
    public void display() {

        System.out.println("Collar Size: " + this.collarSize);

        System.out.println("Sleeve Length: " + this.sleeveLength);

        System.out.println("Material: " + this.material);

    }

    public int getCollarSize() {
        return collarSize;
    }

    public void setCollarSize(int collarSize) {
        this.collarSize = collarSize;
    }

    public int getSleeveLength() {
        return sleeveLength;
    }

    public void setSleeveLength(int sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public static void main(String[] args) {

        // shirt with defauld values
        Shirt shirt1 = new Shirt(); // this calls the default constructor

        shirt1.display();

        // shirt with values
        Shirt shirt2 = new Shirt();

        shirt2.collarSize = 20;

        shirt2.sleeveLength = 18;

        shirt2.material = "Cotton";

        shirt2.display();

        // shirt with parameters
        Shirt shirt3 = new Shirt(11, 12, "Polyester");

        shirt3.display();

    }
}
