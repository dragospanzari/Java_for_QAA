package Collections;

import java.util.HashMap;       // main things in HashMaps are: put, get; HashMap nu pastreaza ordinea cheilor si valorilor
import java.util.Map;

public class Intro_Java_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(5, "Five");
        map.put(8, "Eight");
        map.put(6, "Six");
        map.put(4, "Four");
        map.put(2, "Two");

        String text = map.get(4);       //
        System.out.println(text);       //returneaza textul de la cheia 4 > "Four"

        map.put(6, "Hello\n");
        System.out.println(map.get(6));

        for(Map.Entry<Integer, String> entry:map.entrySet()){       //iteratie in map
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ": " + value);
        }
    }
}
