package Enum;


public enum AppleType {
    Голден(10),
    Гала(15),
    Черный_принц(20),
    Карамелька(40),
    Спартан(15),
    Фуджи(11),
    Ренет_Симиренко(12),
    Хоней_Крисп(5),
    Малинка(18),
    Богатырь(14);

    private float price;

    AppleType(float price) {
        this.price = price;
    }

    float getPrice() {
        return this.price;
    }
}