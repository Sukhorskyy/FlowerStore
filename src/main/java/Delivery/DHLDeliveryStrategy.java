package Delivery;

import FlowerStore.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery {

    @Override
    public void deliver(List<Item> items) {
        System.out.println("You successfully used DHL Delivery");
    }
}
