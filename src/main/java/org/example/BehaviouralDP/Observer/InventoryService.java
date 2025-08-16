package org.example.BehaviouralDP.Observer;

public class InventoryService implements OnOrderPlacedSubscriber{
    public InventoryService(){
        FlipKart flipKart = FlipKart.getInstance();
        flipKart.registerOnOrderPlacedSubscriber(this);
    }
    @Override
    public void announceOrderPlaced() {
        System.out.println("Sending notification to Inventory Service");
    }
}
