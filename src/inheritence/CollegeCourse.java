package inheritence;

public class CollegeCourse {

    private double price;

    private String name;

    protected final String COLLEGE_NAME = "University of Venda";

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCOLLEGE_NAME() {
        return COLLEGE_NAME;
    }

    public double computedPrice(double price) {
        return this.price * 1.15;
    }

    public CollegeCourse(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double computedPrice() {
        return this.getPrice() * 1.15;
    }
}

class Lab extends CollegeCourse {

    public Lab(String n, double p) {
        super(p, n);
        System.out.println("\nIn college course constructor");
    }

    public double computePrice() {
        return super.computedPrice() + 25;
    }
}
