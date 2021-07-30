package Caffee;

public abstract class Beverage implements IBeverage {
    
    private int ml = 100;
    private double dollarsFor100ml = 1;
    String description = "none description";


    @Override
    public void setSize(int ml) {
        this.ml = ml;
    }

    @Override
    public void setPrice(double dollarsFor100ml) {
        this.dollarsFor100ml = dollarsFor100ml;
    }

    @Override
    public int getSize() {
        return ml;
    }

    @Override
    public double price() {
        return getSize() / ml * dollarsFor100ml;
    }

    public String getDescription(){
        return description;
    }

}
