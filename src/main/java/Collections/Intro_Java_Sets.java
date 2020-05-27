package Collections;

import Ocean.Seaweed;

import java.util.HashSet;
import java.util.Set;

public class Intro_Java_Sets {      //seturile sunt colectii care stocheaza doar elemente unice; este folositor cand vrem sa scapam de duplicate
    public static void main(String[] args) {

        //HashSet does not retain order
        //Set<String> set1= new HashSet<String>();

        //LinkedHashSet remembers the order you added items in
        //Set<String> set1= new HashSet<String>();

        //TreeSet sorts in natural order
        Set<String> set1= new HashSet<String>();

        if (set1.isEmpty()) {
            System.out.println("Set is empty at start");
        }
        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("wolf");
        set1.add("bear");

        //adding duplicate items does nothing
        set1.add("mouse");

        System.out.println(set1);

        // Iteration
        for(String element:set1)  {
            System.out.println(element);
        }

        //finding an item
        if(set1.contains("mouse"))    {
            System.out.println("Contains mouse");
        }

        //Intersection      //new set contains some common elements with set1, and some new elements
        Set<String> set2= new HashSet<String>();

        set2.add("dog");
        set2.add("cat");
        set2.add("coyote");
        set2.add("grizzly");
        set2.add("snake");

        Set <String> intersection = new HashSet<String>(set1);      //intesection with set 1
        System.out.println(intersection);       //nu returneaza intersectia
        intersection.retainAll(set2);       //pastreaza doar elementele din intersectie
        System.out.println("Animalele comune in cele 2 seturi sunt : " + intersection);       //returneaza doar elementele comune cat, dog

        /// Differences
        Set <String> differences = new HashSet<String>(set1);
        differences.removeAll(set2);
        System.out.println("Animalele diferite in setul 1 fata de setul 2 : " + differences);
        //differences.removeAll(set1);
        //System.out.println("Animalele diferite in setul 2 fata de setul 1 : " + differences);       //dupa inlaturarea celor din setul 2, e normal sa printeze "empty"
    }
}
