package com.company.factory;

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



}
