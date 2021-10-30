package Delivery;

import FlowerStore.FlowerBucket;
import FlowerStore.Item;

import java.util.List;

public interface Delivery {
    public void deliver(List<Item> items);
}
