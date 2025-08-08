package org.example.StructuralDP.Decorator;

public class OrangeCone implements IceCream{

    IceCream ic;

    public OrangeCone(){

    }

    public OrangeCone(IceCream ic){
        this.ic = ic;
    }

    @Override
    public String getDescription() {
        if(ic != null)
            return ic.getDescription() + "-- Orange Cone";
        return "-- Orange Cone";
    }

    @Override
    public int getCost() {
        if(ic != null)
            return ic.getCost() + 10;
        return 10;
    }
}
