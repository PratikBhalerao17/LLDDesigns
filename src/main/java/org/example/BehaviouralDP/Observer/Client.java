package org.example.BehaviouralDP.Observer;

import org.example.VendingMachine.State.Inventory;

public class Client {
    public static void main(String[] args) {
        FlipKart flipKart = FlipKart.getInstance();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        EmailService emailService = new EmailService();
        InventoryService inventoryService = new InventoryService();


        flipKart.onOrderPlaced();
    }
}
