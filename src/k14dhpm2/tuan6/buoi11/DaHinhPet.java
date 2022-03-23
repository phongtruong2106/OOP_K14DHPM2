/*
*  created date: Mar 21, 2022
*  author: cgm
*/
package k14dhpm2.tuan6.buoi11;

import java.util.ArrayList;
import java.util.List;

import k14dhpm2.tuan5.buoi9.Cat;
import k14dhpm2.tuan5.buoi9.Dog;
import k14dhpm2.tuan5.buoi9.DogRobot;
import k14dhpm2.tuan5.buoi9.Pet;

public class DaHinhPet {

    public static void main(String[] args) {
        List<Pet> list = new ArrayList<>();

        Pet dsPet[] = new Pet[2];

        DogRobot dogRobot = new DogRobot();
        Dog dog = new Dog();
        Cat cat = new Cat();

        list.add(dog);
        list.add(dogRobot);
        list.add(cat);

        for (Pet pet : list) {
            pet.beFriendly();
            
        }
    }
    
}
