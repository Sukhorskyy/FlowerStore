package Flowers;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPacksList = new ArrayList<FlowerPack>();

    public double getPrice() {
        double price = 0;
        for (int i = 0; i < flowerPacksList.size(); i++) {
            price += flowerPacksList.get(i).getPrice();
        }
        return price;
    }
}
