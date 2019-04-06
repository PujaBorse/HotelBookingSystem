package com.fujitsu.shop;
public class Product
{

int productId;
String name;
String brand;
float price;

public Product(){

}
public Product(int productId,String name, String brand, float price){

this.productId = productId;
this.name = name;
this.brand= brand;
this.price=price;
}

public void display(){

  System.out.println(productId);
  System.out.println(name );
  System.out.println( brand);
  System.out.println (price );
}
}