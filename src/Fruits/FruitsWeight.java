package Fruits;

public enum FruitsWeight {
    Apple(1.0f), Orange(1.5f);

    private double weight;
    FruitsWeight(double fruitWeight) {
        this.weight = fruitWeight;
    }

    public double getWeight(){ return weight; }
}
