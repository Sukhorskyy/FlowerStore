package Flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
public class Flower {
    private float sepalLength;
    private double price;
    private FlowerType flowerType;
    private Color color;

    public Flower(FlowerType flowertype) {
        this.flowerType = flowertype;
    }

    @Override
    public boolean equals(Object obj) {
        Flower flower = (Flower) obj;
        if (flower == this) { return true; }
        if (flower.getFlowerType() == this.getFlowerType() &&
                flower.getPrice() == this.getPrice() &&
                flower.getColor() == this.getColor() &&
                flower.getSepalLength() == this.getSepalLength()) {
            return true;
        }
        return false;
    }
}
