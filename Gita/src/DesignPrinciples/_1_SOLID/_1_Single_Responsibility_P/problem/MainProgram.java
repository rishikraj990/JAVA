package DesignPrinciples._1_SOLID._1_Single_Responsibility_P.problem;

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
    /** Ek single class 3 kam ker raha Main  + calculateArea + print
     * jisme se 2 kam calculateArea + print es class ka kam nahi hai
     * to we have to remove these from here
     */

    private static void print(Shape.Circle circle){
        System.out.println("Print: " + circle);
    }
}
