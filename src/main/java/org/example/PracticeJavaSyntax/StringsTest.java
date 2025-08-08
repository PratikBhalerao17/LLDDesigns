package org.example.PracticeJavaSyntax;

import java.nio.charset.StandardCharsets;

public class StringsTest {
    public static void main(String[] args) {
        String abs = "Pratik";
        char [] abc = abs.toCharArray();
//        for(char a: abc){
////            if (Character.isLetterOrDigit(a))
//            if (a == 'a')
//                System.out.println(a);
//        }

        System.out.println(abs.substring(1));
        System.out.println(abs.compareTo("pratik"));
//        System.out.println(abs.subSequence(1,4));


    }
}
