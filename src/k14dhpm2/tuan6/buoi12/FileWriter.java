/*
*  created date: Mar 23, 2022
*  author: cgm
*/
package k14dhpm2.tuan6.buoi12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

class FileWriter {
    public static void write(String fileName, String s) {
    File file = new File(fileName);//File
    PrintWriter out;
    try {
        out = new PrintWriter(file);
        out.println(s);
        out.close();
    } catch (FileNotFoundException e) {
        System.out.println("Sai roi ma oi!");
        e.printStackTrace();
    }//Ghi vao File chuoi s
   
   
    }
}
