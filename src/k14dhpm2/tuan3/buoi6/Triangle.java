/*
*  created date: Feb 23, 2022
*  author: cgm
*/
package k14dhpm2.tuan3.buoi6;

public class Triangle {

    private String sound;

    public Triangle(String sound){
        this.sound = sound;
    }

    void rotate(){
        System.out.println("Xoay 360 độ");
    }

    void playSound(){
        System.out.println("Play sound .aif: "+ this.sound + " music");
    }
    
}
