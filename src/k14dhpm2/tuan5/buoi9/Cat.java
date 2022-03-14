/*
*  created date: Feb 23, 2022
*  author: cgm
*/
package k14dhpm2.tuan5.buoi9;

public class Cat extends Feline implements Pet{

    //dac thu cua rieng no

    

    @Override
    protected void eat() {
        this.eatCat();
    }

    private void eatCat(){
        System.out.println("Cat eating dang benh, milk ...");

    }

    @Override
    protected void makeNoise() {
        System.out.println("Meo meo ...");
    }

    //bổ sung thêm
    public void chaseButterfly(){
        System.out.println("Chasing ....");
    }

    @Override
    public void beFriendly() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        
    }

  
  
  

  

  





  
}
