/*
*  created date: Feb 23, 2022
*  author: cgm
*/
package k14dhpm2.tuan3.buoi6;

public class Amoeba {

    private String sound;
    private double xPoint;
    private double yPoint;
    
    public Amoeba(String sound, double xPoint, double yPoint){
        this.sound = sound;
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }


    void rotate(){
        System.out.println("Xoay 360 độ at xPoint: "+this.xPoint +" yPoint: "+this.yPoint);
    }

    void playSound(){
        System.out.println("Play sound .hif: "+ this.sound + " music");
    } 
    
}
