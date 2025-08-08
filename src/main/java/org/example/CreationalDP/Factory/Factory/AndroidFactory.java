package org.example.CreationalDP.Factory.Factory;

import org.example.CreationalDP.Factory.Components.AndroidButton;
import org.example.CreationalDP.Factory.Components.AndroidMenu;
import org.example.CreationalDP.Factory.Components.Button;
import org.example.CreationalDP.Factory.Components.Menu;

public class AndroidFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
