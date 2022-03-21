/*
*  created date: Mar 07, 2022
*  author: cgm
*/
package k14dhpm2.tuan5.buoi9;

public class Dog extends Animal  implements Pet, IntName {


    public void chaseCat(){
        System.out.println("Chasing cat ...");
    }

    @Override
    protected void eat() {
        //implementation - cài đặt chi tiết
        //cài đặt các code vào đây
        System.out.println("Dog eating Rice ...");
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog Noise ....");
    }

    @Override
    public void beFriendly() {
        System.out.println("Dog Friendly ...");
        
    }

    @Override
    public void play() {
            System.out.println("Play ....");        
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
