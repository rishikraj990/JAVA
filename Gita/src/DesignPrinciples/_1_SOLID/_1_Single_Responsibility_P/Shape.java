package DesignPrinciples._1_SOLID._1_Single_Responsibility_P;

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
}
