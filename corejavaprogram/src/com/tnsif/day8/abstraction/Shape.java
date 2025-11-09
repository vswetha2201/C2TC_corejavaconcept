package com.tnsif.day8.abstraction;


//Abstract class
public abstract class Shape {
 protected String color;

 public Shape(String color) {
     this.color = color;
 }

 // Abstract method to calculate area
 public abstract double area();

 // Abstract method to calculate perimeter
 public abstract double perimeter();

 // Concrete method
 public void displayColor() {
     System.out.println("Shape color: " + color);
 }
}
