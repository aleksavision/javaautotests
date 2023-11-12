package org.example;


import Animals.Cat;
import Animals.Rabbit;
import Animals.Snake;
import Animals.Zoo;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {

public static void main(String[] args) {

//    Zoo forCat = new Cat("Sandy", 5);
//    Zoo forRabbit = new Rabbit("Bunny", 1);
//    Zoo forSnake = new Snake("July", 3);

    int[] newArray = new int[7];
    newArray[0] = 5;
    newArray[1] = 9;
    newArray[2] = -77;
    newArray[3] = -11;
    newArray[4] = 101;
    newArray[5] = 700;
    newArray[6] = 33;

    Cat more = new Cat("Barsik",6);
    more.plus(800);
    more.minus(-100);

    System.out.println(more.toString());

    /////List array

    List<Integer> arrayList = new ArrayList<>();
    arrayList.add(5);
    arrayList.add(-1);
    arrayList.add(11);

    Collections.sort(arrayList);
    System.out.println(arrayList);





}
}