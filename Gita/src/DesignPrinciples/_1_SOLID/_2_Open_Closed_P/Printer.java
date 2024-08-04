package DesignPrinciples._1_SOLID._2_Open_Closed_P;

public class Printer {

    public void print(IShape iShape){
        System.out.println("Print: " + iShape);
    }

}
