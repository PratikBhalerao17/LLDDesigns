package org.example.CreationalDP.Factory.Factory;

import org.example.CreationalDP.Factory.Components.Button;
import org.example.CreationalDP.Factory.Components.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();

}
