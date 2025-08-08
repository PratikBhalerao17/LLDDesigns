package org.example.SOLID;

public class Pigeon extends Bird implements Flyable,Danceble{
    @Override
    public String fly() {
        return "Pigeon is Flying";
    }

    @Override
    String eat() {
        return "Pigeon is Eating";
    }

    @Override
    public String dance() {
        return "Pigeon is Dancing";
    }
}
