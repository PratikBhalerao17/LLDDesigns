package org.example.VendingMachine.State;

import org.example.VendingMachine.Coins;
import org.example.VendingMachine.VendingMachine;

public class HasMoneyState extends State{
    public HasMoneyState(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void insertCoin(Coins coin) {
        System.out.println("Please confirm if we can dispense the item or refund");
    }

    @Override
    public void selectItem(String code) {
        System.out.println("Please confirm if we can dispense the item or refund");
    }

    @Override
    public void dispense() {
        //give item to customer and restock the value and all params and set new idle state
        machine.dispenseItem();
        machine.setState(new IdleState(machine));
    }

    @Override
    public void refund() {
        machine.refundItem();
        machine.setState(new IdleState(machine));
    }
}
