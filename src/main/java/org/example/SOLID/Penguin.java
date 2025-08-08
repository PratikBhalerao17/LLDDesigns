package org.example.SOLID;

public class Penguin extends Bird implements Danceble{
    @Override
    String eat() {
        return "Penguin is Eating";
    }

    @Override
    public String dance() {
        return "Penguin is Dancing";
    }
}
