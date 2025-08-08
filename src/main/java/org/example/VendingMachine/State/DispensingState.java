package org.example.VendingMachine.State;

import org.example.VendingMachine.Coins;
import org.example.VendingMachine.VendingMachine;

public class DispensingState extends State{
    public DispensingState(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void insertCoin(Coins coin) {

    }

    @Override
    public void selectItem(String code) {

    }

    @Override
    public void dispense() {

    }

    @Override
    public void refund() {

    }
}
