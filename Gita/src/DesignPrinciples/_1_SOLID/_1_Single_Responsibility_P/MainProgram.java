package DesignPrinciples._1_SOLID._1_Single_Responsibility_P;

public class MainProgram {

    public static void main(String[] args){
        Shape.Circle circle = new Shape.Circle(5);
        calculateArea(circle);
        Printer printer = new Printer();
        printer.print(circle);
    }

    private static void calculateArea(Shape.Circle circle){
        System.out.println("Area: " + circle.getArea());
    }

}
