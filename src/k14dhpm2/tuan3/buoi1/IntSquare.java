/*
*  created date: Feb 21, 2022
*  author: cgm
*/
package k14dhpm2.tuan3.buoi1;
//Host
public class IntSquare {

    
    //implementation
   private  int squareValue;


   /* //interfaces
    int getSquareMath(int value){

        //implementation - thuat toan
        //interface va implementation khong doc lap/tach biet
        //squareValue = value * value;
        squareValue = (int)Math.pow(value, 2);// thay doi implementation

        return squareValue;

    } */

    //solution

    //interfaces
    int getSquare(int value){
        this.squareValue = this.calculateSquare(value);
        return this.squareValue;
    }


    //implementation
    private int calculateSquare(int value){
        return value * value;
    }




    
}
