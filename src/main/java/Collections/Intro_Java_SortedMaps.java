package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class Intro_Java_SortedMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();      //HashMap nu pastreaza ordinea cheilor si valorilor intr-o anumita ordine
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();        //cheile si valorile stau in aceasi oridine in care sunt adaugate in harta
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();      //sorteaza valorile adaugate intr-o ordine naturala (1,2,3,4....

        //testMap(hashMap);
        //testMap(linkedHashMap);     //pastrewaza odinea in care au fost introduse
        testMap(treeMap);
    }

    public static void testMap(Map <Integer, String> map) {
        map.put(9, "fox");
        map.put(4, "cat");
        map.put(8, "dog");
        map.put(1, "giraffe");
        map.put(0, "swan");
        map.put(15, "rabbit");
        map.put(6, "bear");

        for(Integer  key: map.keySet()) {
            String value = map.get(key);

            System.out.println(key + ": " + value);
        }
    }
}
