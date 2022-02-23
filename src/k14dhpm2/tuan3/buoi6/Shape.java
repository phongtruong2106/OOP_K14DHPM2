/*
*  created date: Feb 23, 2022
*  author: cgm
*/
package k14dhpm2.tuan3.buoi6;

public class Shape {
    private String sound;

    public Shape(){}

    /**
     * @param sound the sound to set
     */
    public void setSound(String sound) {
        this.sound = sound;
    }

    /**
     * @return the sound
     */
    public String getSound() {
        return sound;
    }

    public Shape(String sound) {
        this.sound = sound;
    }

    public void rotate() {
        System.out.println("Xoay 360 độ");
    }

    public void playSound() {
        System.out.println("Play sound .aif: " + this.sound + " music");
    }
}
