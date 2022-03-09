/*
*  created date: Mar 09, 2022
*  author: cgm
*/
package k14dhpm2.tuan4.buoi8;

public class Cow extends Animal{

    double giveMilk;

    public Cow(){
        super();// goi constructor mac dinh cua cha
        System.out.println("Constructor Cow Running ...");


        this.giveMilk = 500;
    }

    public Cow(double giveMilk, String name){
        //super();
        super(name);
        this.giveMilk = giveMilk;

    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Cow [giveMilk=" + giveMilk + "]" + " " + super.toString();
    }

    
    
}
