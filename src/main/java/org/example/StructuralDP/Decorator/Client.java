package org.example.StructuralDP.Decorator;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        IceCream ic = new ChocoSyrup(
                new VanillaScoop(
                        new ChocoSyrup(
                                new OrangeCone(
                                        new OrangeCone()
                                )
                        )
                )
        );

        System.out.println(ic.getCost());
        System.out.println(ic.getDescription());
    }
}
