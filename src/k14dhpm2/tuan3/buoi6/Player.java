/*
*  created date: Feb 22, 2022
*  author: cgm
*/
package k14dhpm2.tuan3.buoi6;

public class Player {
    //attriubte - state
    //implementation
    private int number = 0;

    //interface
    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    //method -behaivor
    public void guess() {
        number = (int) (Math.random() * 10);//1 - 10
        System.out.println("I'm guessing " + number);
    }
}
