package Collections;

import java.util.ArrayList;     // ArrayList manage Arrays internally: [0][1][2][3][4].....
import java.util.LinkedList;        //folosit cand dorim sa adaugam sau sa scoatem un index de oriund din lista
//LinkedList consists of elements where each element has a reference to the previous and next element
import java.util.List;

public class Intro_Java_Collections_LinkedLists {
    public static void main(String[] args) {
      /*  ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>(); */
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        doTiming("ArrayList", arrayList);
        doTiming("LinkedList", linkedList);
    }

    public static void doTiming(String type, List<Integer> list) {
        for (int i = 0; i < 1E5; i++) {      // 1E5 = 100.000
            list.add(i);
        }
        long start = System.currentTimeMillis();
/*
        //Add items at the end of list
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        // Add items at the end of the ArrayList
        for (int i=0; i<5E5; i++)   {
            list.add(list.size(),i);      //add items at the beggining of the list
        }
        } */
/*
        // Add items at beggining of the list
        for (int i=0; i<5E5; i++)   {
            list.add(0,i);      //add items at the beggining of the list
        } */

        // Add items elsewhere in the list
        for (int i=0; i<5E5; i++)   {
            list.add(list.size() - 100,i);      //add items at 100 elements from the end of the list
        }

        long end = System.currentTimeMillis();
        System.out.println("time taken: " + (end - start) + "ms for " + type);
    }
}
