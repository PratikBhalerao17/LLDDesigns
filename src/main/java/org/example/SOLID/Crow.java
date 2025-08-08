package org.example.SOLID;

public class Crow extends Bird implements Danceble{
    @Override
    public String dance() {
        return "Crow is Flying";
    }

    @Override
    String eat() {
        return "Crow is Eating";
    }

}
