package org.example.CreationalDP.Factory;

import org.example.CreationalDP.Factory.Factory.AndroidFactory;
import org.example.CreationalDP.Factory.Factory.IOSFactory;
import org.example.CreationalDP.Factory.Factory.UIFactory;

public class FactoryType {
    public static UIFactory createFactory(FactoryNamesEnum names){
        if(names == FactoryNamesEnum.ANDROID)
            return new AndroidFactory();
        else if (names == FactoryNamesEnum.IOS) {
            return new IOSFactory();
        }
        return null;
    }
}
