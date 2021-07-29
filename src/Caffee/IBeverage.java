package Caffee;

public interface IBeverage {
    int ml = 100;
    double dollarsFor100ml = 1;
    String description = "none description";

    public double price();
    public void setPrice(double dollarsFor100ml);
    public void setSize(int ml);
    public int getSize();
    public String getDescription();
}
