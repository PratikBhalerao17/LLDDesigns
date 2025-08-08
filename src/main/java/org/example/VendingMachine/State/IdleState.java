package org.example.VendingMachine.State;

import org.example.VendingMachine.Coins;
import org.example.VendingMachine.VendingMachine;

public class IdleState extends State{
    public IdleState(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void insertCoin(Coins coin) {
        System.out.println("First select the item then only you can insert the coin");
    }

    @Override
    public void selectItem(String code) {
        //validate item is present
        if(!machine.isItemAvailable(code)){
            System.out.println("Item not found");
            return;
        }
        machine.setSelectedItemCode(code);
        machine.setState(new SelectedItemState(machine));
    }

    @Override
    public void dispense() {
        System.out.println("First select the item");
    }

    @Override
    public void refund() {
        System.out.println("First select the item");
    }
}
