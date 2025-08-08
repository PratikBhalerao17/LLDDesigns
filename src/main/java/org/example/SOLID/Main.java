package org.example.SOLID;

public class Main {
    public static void main(String[] args) {
        Flyable b = new Pigeon();
        System.out.println(b.fly());

        Danceble p = new Penguin();
        System.out.println(p.dance());
    }
}
