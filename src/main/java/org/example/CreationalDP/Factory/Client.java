package org.example.CreationalDP.Factory;

import org.example.CreationalDP.Factory.Components.Button;
import org.example.CreationalDP.Factory.Components.Menu;
import org.example.CreationalDP.Factory.Factory.UIFactory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter =  new Flutter();
        UIFactory factoryobj = flutter.createFactory(FactoryNamesEnum.ANDROID);
        Menu button = factoryobj.createMenu();
        button.display();
    }
}