/*
*  created date: Mar 07, 2022
*  author: cgm
*/
package k14dhpm2.tuan3.buoi6;

public class Dog extends Aninmal {


    public void chaseCat(){
        System.out.println("Chasing cat ...");
    }

    @Override
    protected void eat() {
        System.out.println("Dog eating Rice ...");
    }

    @Override
    protected void makeNoise() {
        System.out.println("Dog Noise ....");
    }



    
}
