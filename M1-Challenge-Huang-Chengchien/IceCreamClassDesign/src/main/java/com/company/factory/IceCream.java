package com.company.factory;

import java.util.Objects;

public class IceCream {
    private String flavor;
    private double salePrice;
    private float productionCost;
    private String productionTime;
    private String ingredients;

    public IceCream(String flavor, double salePrice, float productionCost, String productionTime, String ingredients) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
    }

    public IceCream(){};

    public boolean promotionShouldBeUnder10USD() {
        return this.salePrice <= 10;
    }

    public boolean costShouldBeUnder5USD() {
        return this.productionCost <= 5;
    }

    public double addingTopCream() {
        return this.salePrice += 2;
    }


    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public float getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(float productionCost) {
        this.productionCost = productionCost;
    }

    public String getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(String productionTime) {
        this.productionTime = productionTime;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", salePrice=" + salePrice +
                ", productionCost=" + productionCost +
                ", productionTime='" + productionTime + '\'' +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.salePrice, salePrice) == 0 && Float.compare(iceCream.productionCost, productionCost) == 0 && Objects.equals(flavor, iceCream.flavor) && Objects.equals(productionTime, iceCream.productionTime) && Objects.equals(ingredients, iceCream.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, salePrice, productionCost, productionTime, ingredients);
    }
}
