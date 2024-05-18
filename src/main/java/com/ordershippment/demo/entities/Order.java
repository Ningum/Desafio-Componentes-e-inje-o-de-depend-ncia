package com.ordershippment.demo.entities;

public class Order {

  private int code;
  private double basic;
  private double discount;

  public int getCode() {
    return this.code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public double getBasic() {
    return this.basic;
  }

  public void setBasic(double basic) {
    this.basic = basic;
  }

  public double getDiscount() {
    return this.discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  public Order(int code, double basic, double discount) {
    this.code = code;
    this.basic = basic;
    this.discount = discount;
  }

}
