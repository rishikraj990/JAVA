package DesignPrinciples._1_SOLID._2_Open_Closed_P.problem;

public class MainProgram {

    public static void main(String[] args){
        Printer printer = new Printer();

        Shape.Circle circle = new Shape.Circle(5);
        calculateArea(circle);
        printer.print(circle);

        Shape.Rectangle rectangle = new Shape.Rectangle(5, 2);
        calculateArea(rectangle);
        printer.print(rectangle);

        /** jase hi hum rectangle banaye to humko sara method jase calculateArea, print firse likna pada
         * aur aage jetna add karenge ute bar sab chij firse likhna hoga
         * to we have to use parent child property to solve this issue
         */
    }

    private static void calculateArea(Shape.Circle circle){
        System.out.println("Area: " + circle.getArea());
    }

    private static void calculateArea(Shape.Rectangle rectangle){
        System.out.println("Area: " + rectangle.getArea());
    }

}
