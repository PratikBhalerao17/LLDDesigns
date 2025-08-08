package org.example.VendingMachine.State;

import org.example.VendingMachine.Coins;
import org.example.VendingMachine.VendingMachine;

public class SelectedItemState extends State{

    public SelectedItemState(VendingMachine machine){
        super(machine);
    }

    @Override
    public void insertCoin(Coins coin) {
        // update the balance
        int balance  = machine.updateBalance(coin);
        if(machine.isBalanceEnough()){
            System.out.println("We got enough money and current balance is " + balance);
            machine.setState(new HasMoneyState(machine));
        }
        else{
            System.out.println("Balance is not enough and current balance is "+ balance);
        }
    }

    @Override
    public void selectItem(String code) {
        System.out.println("You can insert the coin");
    }

    @Override
    public void dispense() {
        System.out.println("First insert the coin");
    }

    @Override
    public void refund() {
        System.out.println("First insert the coin");
    }
}
