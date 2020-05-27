package Collections;

import java.util.ArrayList;     //ArrayList se folosesc atunci cand vrem sa adaugam/inlaturam un item de la inceputul sau sfarsitul Array-ului
import java.util.List;

public class Intro_Java_Collections_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();      //nu se poate folosi tipul primitv de date <int>, doar <Integer>
        //Adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(1999);
        //Retrieving
        System.out.println(numbers.get(0) + "\n");     //intre parantezele rotunde se trece indexul

        //indexed for loop iteration
        System.out.println("Iteration #1:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

            System.out.println("\n Iteration #2:");
            for (Integer value : numbers) {
                System.out.println(value);
            }
        }
        //Removing items
        numbers.remove(0);       //va inlatura primul numar de la indexul 0, dar e foarte greoi
        numbers.remove(numbers.size() - 1);     //inlatura de la sfarsitul arrayului
        System.out.println(numbers);        //dupa ce este inlaturat primul si ultimul index, va printa doar pe cel ramas

        //List interfaces
        List<String> values = new ArrayList<String>();

    }

}
