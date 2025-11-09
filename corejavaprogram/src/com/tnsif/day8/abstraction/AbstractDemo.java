package com.tnsif.day8.abstraction;


public class AbstractDemo {
    public static void main(String[] args) {

        Shape rect = new Rectangle("Red", 10, 5);
        Shape square = new Square("Blue", 7);

        System.out.println(rect);
        rect.displayColor();

        System.out.println();

        System.out.println(square);
        square.displayColor();
    }
}
