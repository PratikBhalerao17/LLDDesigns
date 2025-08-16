package org.example.BehaviouralDP.Observer;

public class EmailService implements OnOrderPlacedSubscriber{

    public EmailService(){
        FlipKart flipKart = FlipKart.getInstance();
        flipKart.registerOnOrderPlacedSubscriber(this);
    }
    @Override
    public void announceOrderPlaced() {
        System.out.println("Sending email to customer");
    }
}
