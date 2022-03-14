/*
*  created date: Feb 21, 2022
*  author: cgm
*/
package k14dhpm2.tuan3.buoi5;
//Host
public abstract class IntSquareAbstract {

    
    //implementation
   private  int squareValue;

   /**
    * @return the squareValue
    */
   public int getSquareValue() {
       return squareValue;
   }

   /**
    * @param squareValue the squareValue to set
    */
   public void setSquareValue(int squareValue) {
       this.squareValue = squareValue;
   }


   /* //interfaces
    int getSquareMath(int value){

        //implementation - thuat toan
        //interface va implementation khong doc lap/tach biet
        //squareValue = value * value;
        squareValue = (int)Math.pow(value, 2);// thay doi implementation

        return squareValue;

    } */

    //solution - Encapsuation - Abstraction

    //interfaces
    public abstract int getSquare(int value);


   
   
   
   
   




    
}
