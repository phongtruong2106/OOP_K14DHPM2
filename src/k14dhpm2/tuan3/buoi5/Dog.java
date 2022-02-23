/*
*  created date: Feb 21, 2022
*  author: cgm
*/
package k14dhpm2.tuan3.buoi5;

public class Dog {

    //attribute
     private int size; //private impementation
     protected String breed;
     String name;

    //method???
    //setter/getter // public interfaces
    public void setSize(int size){
        //code ràng buộc tính nhất quán dữ liệu ở đây
        if(size > 0){
            this.size = size;
        }else{//Exception
            System.out.println("Size không hợp lệ!!!");
        }
        
    }

    public int getSize(){

        return this.size;

    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
}
