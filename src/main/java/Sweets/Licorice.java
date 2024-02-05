package Sweets;

public class Licorice extends Sweet {
    private Double length;

    public Licorice() {}

    public Licorice(String productName, Double price, Double weight, Double length) {
        super(productName, price, weight);
        this.length = length;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Licorice + [" + super.toString() + ", length = " + length + "]";
    }
}
