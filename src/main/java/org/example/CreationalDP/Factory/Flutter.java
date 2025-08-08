package org.example.CreationalDP.Factory;

import org.example.CreationalDP.Factory.Factory.AndroidFactory;
import org.example.CreationalDP.Factory.Factory.IOSFactory;
import org.example.CreationalDP.Factory.Factory.UIFactory;

public class Flutter {
    public UIFactory createFactory(FactoryNamesEnum names){
        return FactoryType.createFactory(names);
    }
    public void reset(){
        System.out.println("We are resetting the page");
    }
    public void cache(){
        System.out.println("Cache is collected");
    }
}
