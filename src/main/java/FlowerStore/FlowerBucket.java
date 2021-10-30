package FlowerStore;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacksList = new ArrayList<FlowerPack>();

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacksList.add(flowerPack);
    }

    @Override
    public String getDescription() {
        return this.toString();
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (int i = 0; i < flowerPacksList.size(); i++) {
            price += flowerPacksList.get(i).getPrice();
        }
        return price;
    }


}
