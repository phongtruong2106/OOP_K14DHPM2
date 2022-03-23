/*
*  created date: Mar 21, 2022
*  author: cgm
*/
package k14dhpm2.tuan6.buoi11;
import static java.lang.System.*;

public class Duck {
    private int size;//bien object
    private String name;
    private static int dem = 0;//thah vien class

    //khoi static
    static{
        //code 1 dong trong day
        out.println("He he ....");
    }

    /**
     * @return the dem
     */
    //than vien class
    public static int getDem() {
       // this.size = 0;
        return dem;
    }


    public Duck(int size){
        this.size = size;
        demVit();
    }

    public Duck(){
        demVit();
    }

    private void demVit(){
        dem++;
    }
    //getter
    //setter
    /**
     * @return the size
     */
    public int getSize() {
        dem = 0;
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
}
