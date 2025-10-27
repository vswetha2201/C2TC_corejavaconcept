package day8.abstraction;


public class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square [side=" + side +
               ", area=" + area() + ", perimeter=" + perimeter() + "]";
    }
}
