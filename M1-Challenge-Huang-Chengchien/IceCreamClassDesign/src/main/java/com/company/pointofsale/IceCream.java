package com.company.pointofsale;

import java.util.Objects;

public class IceCream {

    private String flavor;
    private double price;
    private String quantity;
    public IceCream(String flavor, double price, String quantity) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
    }

    public IceCream() {

    }

    public double buy3GetOneFree(){
        return this.price*2/3;
    }

    public String quantityOnThePackage(){
        return "The current quantity is "+quantity;
    }

    public double forCharity(){
        return this.price*0.8;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.price, price) == 0 && Objects.equals(flavor, iceCream.flavor) && Objects.equals(quantity, iceCream.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, price, quantity);
    }
}
