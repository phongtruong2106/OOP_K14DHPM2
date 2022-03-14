/*
*  created date: Feb 23, 2022
*  author: cgm
*/
package k14dhpm2.tuan5.buoi9;

public abstract class Animal {

    private String picture;
    private String food;
    private int hunger;


    //interface
    protected abstract void makeNoise();
    protected abstract void eat();




    protected void sleep() {

        System.out.println("Sleeping ...");

    }

    protected void roam() {

        System.out.println("Roaming ...");

    }

    

}
