package org.example.VendingMachine;

import org.example.VendingMachine.State.IdleState;
import org.example.VendingMachine.State.Inventory;
import org.example.VendingMachine.State.State;

public class VendingMachine {
    public static VendingMachine INSTANCE = new VendingMachine();
    private int balance;
    private String selectedItemCode;
    private State currentState;
    private final Inventory inventory= new Inventory();

    public static VendingMachine getINSTANCE(){
        return INSTANCE;
    }

    private VendingMachine(){
        currentState = new IdleState(this);
    }

    public void selectItem(String code){
        this.currentState.selectItem(code);
    }

    public void setSelectedItemCode(String code){
        this.selectedItemCode = code;
        System.out.println("Customer has selected the item " + inventory.getItem(code).getName()  +" which costs $" + inventory.getItem(code).getPrice());
    }

    public void setState(State state){
        this.currentState = state;
    }

    public boolean isItemAvailable(String code){
        return inventory.isItemAvailable(code);
    }

    public void insertCoin(Coins coin){
        this.currentState.insertCoin(coin);
    }

    public int updateBalance(Coins coin){
        int amount = coin.getValue();
        this.balance+=amount;
        return this.balance;
    }



    public boolean isBalanceEnough(){
        return this.balance >= inventory.getItem(selectedItemCode).getPrice();
    }

    public void refund(){
        this.currentState.refund();
    }

    public void refundItem(){
        System.out.println("Returning all the balance of " + this.balance + " and cancelled the dispensing process");
        reset();
    }

    public void dispense(){
        this.currentState.dispense();
    }
    public void dispenseItem(){
        int remaining = this.balance - inventory.getItem(selectedItemCode).getPrice();
        System.out.println("The product " + inventory.getItem(selectedItemCode).getName() + " is dispatched to the customer");
        System.out.println("The remaining change of " + remaining + " is also transferred to customer");
        reset();
    }

    public void reset(){
        this.balance = 0;
        this.selectedItemCode = null;
    }

    public void addItem(String code, String name, int price, int quantity){
        inventory.addItem(code,name,price,quantity);
    }


}
