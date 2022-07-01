package com.company.pointofsale;

public class IceCream {

    private String flavor;
    private double price;
    private String quantity;
    public IceCream(String flavor, double price, String quantity) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", price=" + price +
                ", quantity='" + quantity + '\'' +
                '}';
    }


}
