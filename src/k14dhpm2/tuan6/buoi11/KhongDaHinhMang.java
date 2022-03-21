/*
*  created date: Mar 21, 2022
*  author: cgm
*/
package k14dhpm2.tuan6.buoi11;

import k14dhpm2.tuan5.buoi9.Cat;
import k14dhpm2.tuan5.buoi9.Dog;

public class KhongDaHinhMang {

    public static void main(String[] args) {
        // dah sach quan ly meo

        Cat danhSach[] = new Cat[3];
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        danhSach[0] = cat;
        danhSach[1] = cat2;
        danhSach[2] = new Cat();

        // in danh sach
        for (Cat ca : danhSach) {
            ca.makeNoise();
        }

        Dog danhSach2[] = new Dog[3];
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        danhSach2[0] = dog;
        danhSach2[1] = dog2;
        danhSach2[2] = new Dog();


        for (Dog d : danhSach2) {
            //rang buoc code som
            d.makeNoise();
        }

    }

}
