/*
*  created date: Feb 23, 2022
*  author: cgm
*/
package k14dhpm2.tuan3.buoi6;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setSound("circle.aif");
        circle.rotate();
        circle.playSound();

        Shape shape;

        shape = circle;


        System.out.println("Testing Amoeba ...");
        Amoeba amoeba = new Amoeba();
        amoeba.setxPoint(5);
        amoeba.setyPoint(10);
        amoeba.setSound("amoebaMusic.hif");
        amoeba.rotate();
        amoeba.playSound();



    }
    
}
