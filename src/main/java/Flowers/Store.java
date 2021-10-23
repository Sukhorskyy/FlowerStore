package Flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @ToString
public class Store {
    private List<FlowerPack> flowerPacksList = new ArrayList<FlowerPack>();

    void addPack(Flower flower, int amount) {
        FlowerPack flowerPack = new FlowerPack(amount, flower);
        flowerPacksList.add(flowerPacksList.size(), flowerPack);
    }

    FlowerPack search(Flower flower) {
        for (int i = 0; i < flowerPacksList.size(); i++) {
            if (flowerPacksList.get(i).getFlower().equals(flower)) {
                return flowerPacksList.get(i);
            }
        }
        return null;
    }
}
