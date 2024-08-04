package DesignPrinciples._1_SOLID._5_Dependency_Inversion_P;

public class Shape {

    public static class Circle implements I2DShape {
        public double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }
    public static class Rectangle implements I2DShape {
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

    public static class Square implements I2DShape {
        public double side;

        public Square(double side) {
            this.side = side;
        }

        public double getArea() {
            return side * side;
        }
    }

    public static class Cube implements I3DShape {
        public double side;
        public Cube(double side){
            this.side = side;
        }

        public double getVolume(){
            return side * side * side;
        }
    }
}
