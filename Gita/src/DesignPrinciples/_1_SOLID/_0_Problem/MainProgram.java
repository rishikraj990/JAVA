package DesignPrinciples._1_SOLID._0_Problem;

public class MainProgram {

    public static void main(String[] args){
        Shape.Circle circle = new Shape.Circle(5);
        calculateArea(circle);
        print(circle);
    }

    private static void calculateArea(Shape.Circle circle){
        double area = Math.PI * circle.radius * circle.radius;
        System.out.println("Area: " + area);
    }

    private static void print(Shape.Circle circle){
        System.out.println("Print: " + circle);
    }
}
