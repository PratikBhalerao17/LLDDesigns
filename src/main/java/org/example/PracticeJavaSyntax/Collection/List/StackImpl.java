package org.example.PracticeJavaSyntax.Collection.List;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackImpl {
    public static void main(String[] args) {
//        List<String> stack = new Stack<>();
//
//        stack.add("Dog");
//        stack.add("Cat");
//        stack.add("Bird");
//
//        System.out.println(stack.get(0));

        Stack<String> stack = new Stack<>();

        stack.add("Dog");
        stack.add("Cat");
        stack.add("Bird");

        System.out.println(stack);
        System.out.println(stack.peek()); //Bird
        System.out.println(stack.pop()); // Bird
        System.out.println(stack);//[Dog, Cat]


        Iterator<String> it = stack.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        // Dog
        // Cat
    }
}
