package org.example.VendingMachine.State;

import org.example.VendingMachine.Coins;
import org.example.VendingMachine.VendingMachine;

public abstract class State {
    public VendingMachine machine;

    public State(VendingMachine machine){
        this.machine = machine;
    }

    public abstract void insertCoin(Coins coin);
    public abstract void selectItem(String code);
    public abstract void dispense();
    public abstract void refund();

}
