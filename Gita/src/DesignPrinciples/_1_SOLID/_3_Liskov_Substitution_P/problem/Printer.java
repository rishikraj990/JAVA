package DesignPrinciples._1_SOLID._3_Liskov_Substitution_P.problem;

public class Printer {

    public void print(IShape iShape){
        System.out.println("Print: " + iShape);
    }

}
