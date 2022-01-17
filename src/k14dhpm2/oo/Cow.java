/*
*  created date: Jan 17, 2022
*  author: cgm
*/
package k14dhpm2.oo;


public class Cow {
    
    float weight;

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Cow(){
        this.weight = 0.5f;
    }

    public Cow(float weight){
        this.weight = weight;
    }
    
}
