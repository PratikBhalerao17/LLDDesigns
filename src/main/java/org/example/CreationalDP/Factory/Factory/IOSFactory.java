package org.example.CreationalDP.Factory.Factory;

import org.example.CreationalDP.Factory.Components.Button;
import org.example.CreationalDP.Factory.Components.IOSButton;
import org.example.CreationalDP.Factory.Components.IOSMenu;
import org.example.CreationalDP.Factory.Components.Menu;

public class IOSFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
