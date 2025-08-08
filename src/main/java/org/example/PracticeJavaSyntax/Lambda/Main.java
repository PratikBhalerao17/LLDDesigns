package org.example.PracticeJavaSyntax.Lambda;

import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {

        BiPredicate<String,Integer> biPredicate = new BiPredicate<String, Integer>() {
            @Override
            public boolean test(String s, Integer integer) {
                return s.length()>integer;
            }
        };
//        System.out.println(biPredicate.test("Pratik",10)); // false
//        System.out.println(biPredicate.test("Pratik",2)); // true


        BiPredicate<String,Integer> biPredicate1 = (str1,val) -> str1.length() > val;
        System.out.println(biPredicate1.test("Pratik",2)); // true


    }
}
