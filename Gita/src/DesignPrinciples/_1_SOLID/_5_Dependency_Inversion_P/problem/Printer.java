package DesignPrinciples._1_SOLID._5_Dependency_Inversion_P.problem;

public class Printer {

    public void print(IShape iShape){
        System.out.println("Print: " + iShape);
    }

    public void printf(IShape iShape){
        System.out.printf("PrintF: " + iShape);
    }

}
