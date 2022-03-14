/*
*  created date: Mar 07, 2022
*  author: cgm
*/
package k14dhpm2.tuan5.buoi9;

public class Dog extends Animal implements Pet, IntName {


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

    @Override
    public void beFriendly() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

    
   
   
   
   

   
   
   
   
   



    
}
