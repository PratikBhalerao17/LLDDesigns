package org.example.VendingMachine;

public enum Coins {

    PENNY(1),
    DIME(5),
    QUARTER(25);

    private final int value;

    Coins(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
