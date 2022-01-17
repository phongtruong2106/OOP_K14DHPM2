/*
*  created date: Jan 12, 2022
*  author: cgm
*/
package k14dhpm2.oo;

public class Student {

    //attribute
    //bien
    //bien trang thai //bien object
    String name;
    double age;
    String mssv;
    String lop;


    //methods : functions

    //constructor:
    //?????

    //constructor mặc định do developers
    public Student(){

    }

    public Student(String name, double age){
        this.name = name;
        this.age = age;
    }

    public Student(/*this,*/ String name, double age, String mssv, String lop){
        //call constructor 2 tham so
        this(name, age);//luon dat o dong dau tien cua constructor
        this.mssv = mssv;
        this.lop = lop;
    }

    void hoc(){
        System.out.println("Hoc ...");
        
    }

    void doc(){
        System.out.println("Doc sach ...");
    }

    void thi(/**this */){
        System.out.println("Thi ...");
        this.mssv = "";
    }

    void hoatDongNgoaiKhoa(){
        
    }
    
}
