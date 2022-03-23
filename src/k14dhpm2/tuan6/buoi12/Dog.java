/*
*  created date: Mar 23, 2022
*  author: cgm
*/
package k14dhpm2.tuan6.buoi12;

public class Dog {
    //dem
    public static int dem;//thanh vien class
    private int size;

    //khoi static
    static{
        //nhieu dong code
        
    }

    /**
     * @return the dem
     */
    public static int getDem() {
        //this.size = 5;
        return dem;
    }

    public Dog(){
        dem++;
    }
    
    public void bark(){
        System.out.println("Barking ...");
    }
    
}
