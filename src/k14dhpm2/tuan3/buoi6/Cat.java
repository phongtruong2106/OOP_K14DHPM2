/*
*  created date: Feb 23, 2022
*  author: cgm
*/
package k14dhpm2.tuan3.buoi6;

public class Cat extends Feline{

    //dac thu cua rieng no
    @Override
    protected void makeNoise() {
        System.out.println("Meo meo ...");
    }

    //bổ sung thêm
    public void chaseButterfly(){
        System.out.println("Chasing ....");
    }

    
}
