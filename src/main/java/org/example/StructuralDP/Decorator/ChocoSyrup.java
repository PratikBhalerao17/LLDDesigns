package org.example.StructuralDP.Decorator;

public class ChocoSyrup implements IceCream{
    IceCream ic;

    public ChocoSyrup(IceCream ic){
        this.ic = ic;
    }


    @Override
    public String getDescription() {
        return ic.getDescription() + "--Choco syrup";
    }

    @Override
    public int getCost() {
        return ic.getCost() + 20;
    }
}
