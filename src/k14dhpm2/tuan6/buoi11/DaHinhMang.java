/*
*  created date: Mar 21, 2022
*  author: cgm
*/
package k14dhpm2.tuan6.buoi11;

import k14dhpm2.tuan5.buoi9.Animal;
import k14dhpm2.tuan5.buoi9.Cat;
import k14dhpm2.tuan5.buoi9.Dog;
import k14dhpm2.tuan5.buoi9.Hippo;

public class DaHinhMang {

    public static void main(String[] args) {
        //danh sach voi Kieu class cha
        Animal danhSachThu[] =  new Animal[6];

        Cat cat = new Cat();
        Cat cat2 = new Cat();

        Dog dog = new Dog();
        Dog dog2 = new Dog();

        danhSachThu[0] = cat;
        danhSachThu[1] = cat2;
        danhSachThu[2] = dog;
        danhSachThu[3] = dog2;

        Hippo hippo = new Hippo();

        danhSachThu[4] = hippo;

        danhSachThu[5] = new Pig();


        for (Animal animal : danhSachThu) {
            
            //if(animal instanceof Dog){

                //rang buoc code tre
                animal.makeNoise();//DA 

           // }
        }
    }

}
