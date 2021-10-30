package FlowerStore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class FlowerPack {
    private int amount;
    private Flower flower;

    public FlowerPack(int amount, Flower flower) {
        this.amount = amount;
        this.flower = flower;
    }

    public double getPrice(){
        return this.flower.getPrice() * amount;
    }

    @Override
    public boolean equals(Object obj) {
        FlowerPack flowerPack = (FlowerPack) obj;
        if (flowerPack == this) { return true; }
        if (flowerPack.getFlower() == this.getFlower() &&
                flowerPack.getAmount() == this.getAmount()) {
            return true;
        }
        return false;
    }
}
