/*
*  created date: Mar 16, 2022
*  author: cgm
*/
package k14dhpm2.tuan5.buoi10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import k14dhpm2.tuan4.buoi8.HangThucPham;

public class ReadingObject {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream inFile = new FileInputStream("htp.dat");

        ObjectInputStream objIn = new ObjectInputStream(inFile);

        HangThucPham htp =  (HangThucPham) objIn.readObject();

        HangThucPham htp2 =  (HangThucPham) objIn.readObject();

        System.out.println(htp);
        System.out.println(htp2);


        
    }
    
}
