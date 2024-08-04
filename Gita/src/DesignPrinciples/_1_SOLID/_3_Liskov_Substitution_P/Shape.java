package DesignPrinciples._1_SOLID._3_Liskov_Substitution_P;

public class Shape {

    public static class Circle implements IShape {
        public double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }
    public static class Rectangle implements IShape {
        public double length;
        public double breadth;

        public Rectangle(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public double getArea() {
            return length * breadth;
        }
    }

    public static class Square implements IShape {
        public double side;

        public Square(double side) {
            this.side = side;
        }

        public double getArea() {
            return side * side;
        }
    }
}
