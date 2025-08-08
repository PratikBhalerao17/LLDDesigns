package org.example.PracticeJavaSyntax.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(12,14,16,17);
        List<Integer> list = List.of(12,14,16,17);


        System.out.println(list); // [12, 14, 16, 17]
//        list.add(15); //Exception

//        list.add(15); //Exception
//        System.out.println(list);

        List<Integer> ans =  new ArrayList<>();
        ans.add(12);
        ans.add(15);
        System.out.println(ans); // [12, 15]

        ans.add(0,22);
        System.out.println(ans); //[22, 12, 15]
        ans.addAll(list);
        System.out.println(ans); //[22, 12, 15, 12, 14, 16, 17]


        System.out.println(ans.get(0)); // 22
        ans.remove(0);
        System.out.println(ans); // [12, 15, 12, 14, 16, 17]

        ans.remove(Integer.valueOf(12));

        System.out.println(ans); // [15, 12, 14, 16, 17]

        ans.set(0,12);
        System.out.println(ans); // [12, 12, 14, 16, 17]

        ans.remove(Integer.valueOf(12));

        System.out.println(ans); // [12, 14, 16, 17]

        System.out.println(ans.contains(12)); //true

        Iterator<Integer> it = ans.iterator();

        while (it.hasNext())
            System.out.println(it.next());
//        12
//        14
//        16
//        17

    }
}

