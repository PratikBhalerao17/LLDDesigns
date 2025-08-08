package org.example.StructuralDP.Decorator;

public class VanillaScoop implements IceCream{

    private IceCream ic;

    public VanillaScoop(IceCream ic){
        this.ic = ic;
    }

    @Override
    public String getDescription() {
        return ic.getDescription() + "--Vanilla Scoop";
    }

    @Override
    public int getCost() {
        return ic.getCost() + 15;
    }
}
