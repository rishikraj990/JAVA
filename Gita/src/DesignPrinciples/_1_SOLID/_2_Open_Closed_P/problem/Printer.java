package DesignPrinciples._1_SOLID._2_Open_Closed_P.problem;

public class Printer {

    public void print(Shape.Circle circle){
        System.out.println("Print: " + circle);
    }
    public void print(Shape.Rectangle rectangle){
        System.out.println("Print: " + rectangle);
    }

}
