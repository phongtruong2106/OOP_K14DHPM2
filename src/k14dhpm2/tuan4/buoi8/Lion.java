/*
*  created date: Feb 23, 2022
*  author: cgm
*/
package k14dhpm2.tuan4.buoi8;

public class Lion extends Feline {

    @Override//ghi de
    protected void eat() {
        System.out.println("Lion Eating ..., meat, fish, ..");
    }

    @Override
    protected void makeNoise() {
        System.out.println("Lion sound ...");
    }

    
}
