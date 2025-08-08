package org.example.VendingMachine;

public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine machine = VendingMachine.getINSTANCE();
        machine.addItem("A1","Coke",10,10);
        machine.addItem("A2","Fanta",15,10);
        machine.addItem("A3","Sprite",20,10);


        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!Inserting the coin");
        machine.insertCoin(Coins.PENNY);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!Selecting the product");
        machine.selectItem("A3");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!Dispensing the item");
        machine.dispense();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!Inserting the coin");
        machine.insertCoin(Coins.PENNY);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!Dispensing the item");
        machine.dispense();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!Inserting the coin");
        machine.insertCoin(Coins.QUARTER);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!Refunding the item");
        machine.refund();
    }
}
