/*
*  created date: Mar 21, 2022
*  author: cgm
*/
package k14dhpm2.tuan6.buoi11;

import java.util.ArrayList;
import java.util.List;

import k14dhpm2.tuan5.buoi9.Animal;
import k14dhpm2.tuan5.buoi9.Dog;
import k14dhpm2.tuan5.buoi9.Hippo;
import k14dhpm2.tuan5.buoi9.Pet;

public class MatHanhViObject {

    public static void main(String[] args) {
        List<Pet> list  = new ArrayList();
        Dog dog = new Dog();
        list.add(dog);
        Pet pet =  list.get(0);


        //pet.ch
        //mat hanh vi
        //lay lai hanh vi - Ep kieu
        Dog dog2 = (Dog)pet;//cu phap ep kieu
        dog2.makeNoise();
        dog2.chaseCat();
        dog2.beFriendly();

        Animal animal  = dog2;
        animal.makeNoise();
        //animal.cha
        
    }
    
}
