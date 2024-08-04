package DesignPrinciples._1_SOLID._2_Open_Closed_P.problem;

public class Shape {

    public static class Circle {
        public double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }
    public static class Rectangle {
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
}
