package org.example.BehaviouralDP.Observer;

public class InvoiceGenerator implements OnOrderPlacedSubscriber{
    public InvoiceGenerator(){
        FlipKart flipKart = FlipKart.getInstance();
        flipKart.registerOnOrderPlacedSubscriber(this);
    }
    @Override
    public void announceOrderPlaced() {
        System.out.println("Generating invoice for orderPlaced");
    }
}
