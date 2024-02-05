package Sweets;

public class Lolipop extends Sweet {

    private Double radius;

    public Lolipop(String productName, Double price, Double weight, Double radius) {
        super(productName, price, weight);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Lolipop + [" + super.toString() + ", length = " + radius + "]";
    }
}
