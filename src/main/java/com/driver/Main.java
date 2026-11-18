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
    System.out.print(p.product(10,20));
    System.out.print(p.product(10,20,30));
    System.out.println(p.product(2.5, 4.5));
  }
}
