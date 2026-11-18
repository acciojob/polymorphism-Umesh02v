package com.driver;

public class Main {
satic clas Product{
  public int probuct(int x,int y){
    return x*y;
}
  public int product(int x,int y,int z){
    return x*y*z;
  }
  public double product(double x,double y){
    return x*y;
  }
}
  public static void main(String[] args){
    Product p = new Product();
    System.out.print("Product of two integer: "+p.product(10,20));
    System.out.print("Product of three integer: "+p.product(10,20,30));
    System.out.println("Product of two double values: " + p.product(2.5, 4.5));
  }
}
