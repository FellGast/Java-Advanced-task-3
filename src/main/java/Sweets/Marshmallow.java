package Sweets;

public class Marshmallow extends Sweet {

    private String color;

    public Marshmallow(String productName, Double price, Double weight, String color) {
        super(productName, price, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Marshmallow + [" + super.toString() + ", length = " + color + "]";
    }
}
