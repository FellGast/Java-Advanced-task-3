package Sweets;

import com.sun.org.apache.xpath.internal.objects.XString;

public abstract class Sweet {
    private String productName;
    private Double price;
    private Double weight;

    public Sweet() {}

    public Sweet(String productName, Double price, Double weight) {
        this.productName = productName;
        this.price = price;
        this.weight = weight;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "brand = " + productName + ", price = " + price + ", weight = " + weight;
    }
}

