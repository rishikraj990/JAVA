package DesignPrinciples._1_SOLID._4_Interface_Segregation_P.problem;

public class MainProgram {

    public static void main(String[] args){
        Printer printer = new Printer();

        Shape.Circle circle = new Shape.Circle(5);
        calculateArea(circle);
        printer.print(circle);

        Shape.Rectangle rectangle = new Shape.Rectangle(5, 2);
        calculateArea(rectangle);
        printer.print(rectangle);

        Shape.Square square = new Shape.Square(4);
        calculateArea(square);
        printer.print(square);

        /** yaha agar cube add kernge jo ki ek shape hai pr uske pas area nahi hota uske pas volume hota hai
         * aur baki ke pas area, to agar ishape interface ko dekhe to ek tarah se wo sahi nahi hai
         * shape 2D , 3D hota hai, ko direct IShape na use kerke IShape (parent) and I2DShape (child) is better approach hai
         * ise we will not force 2d shape to implement 3d methods, and vice-versa.
         */
    }

    private static void calculateArea(IShape iShape){
        System.out.println("Area: " + iShape.getArea());
    }

}
