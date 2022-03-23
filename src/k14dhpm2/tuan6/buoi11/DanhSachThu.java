/*
*  created date: Mar 21, 2022
*  author: cgm
*/
package k14dhpm2.tuan6.buoi11;

import java.util.ArrayList;
import java.util.List;

import k14dhpm2.tuan5.buoi9.Animal;
import k14dhpm2.tuan5.buoi9.Dog;

public class DanhSachThu {
    private List<Animal> danhSach = new ArrayList<>();

    // them
    // xoa
    // sua
    public Animal timKiemThu(String name) {
        Animal animalTimThay = null;
        // code tim
        for (Animal animal : danhSach) {
            if (animal.getName().equals(name)) {
                animalTimThay = animal;
            }
        }

        return animalTimThay;

    }

    public Animal timKiemDog(String name) {
        Dog dogTimThay = null;
        // code tim
        for (Animal animal : danhSach) {
            if (animal.getName().equals(name) && animal instanceof Dog) {
                dogTimThay =  (Dog) animal;
            }
        }
        return dogTimThay;
    }

}
