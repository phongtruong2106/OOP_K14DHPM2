/*
*  created date: Mar 09, 2022
*  author: cgm
*/
package k14dhpm2.tuan4.buoi8;

public class Animal {
    
    private String name;

    // public Animal(){
        //super(); goi constructor //mac dinh cua cha
        // // // System.out.println("Constructor cua Animal runing ...");
        // this.name = "CoBe";
    // }

    public Animal(){}

    /**
     * @param name
     */
    public Animal(String name) {
        this.name = name;
    }



    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Animal [name=" + name + "]";
    }

    
}
