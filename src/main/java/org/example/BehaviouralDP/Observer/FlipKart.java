package org.example.BehaviouralDP.Observer;

import java.util.ArrayList;
import java.util.List;

public class FlipKart {
    private static FlipKart instance = null;
    public static FlipKart getInstance(){
        if(instance==null)
            instance = new FlipKart();
        return instance;
    }
    private FlipKart(){}

    private List<OnOrderPlacedSubscriber> onOrderPlacedSubscribers = new ArrayList<>();

    public void registerOnOrderPlacedSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber){
        onOrderPlacedSubscribers.add(onOrderPlacedSubscriber);
    }

    public void unRegisterOnOrderPlacedSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber){
        onOrderPlacedSubscribers.remove(onOrderPlacedSubscriber);
    }

    public void onOrderPlaced(){
        for(OnOrderPlacedSubscriber onOrderPlacedSubscriber:onOrderPlacedSubscribers)
            onOrderPlacedSubscriber.announceOrderPlaced();
    }

}
